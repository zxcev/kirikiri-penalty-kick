package penaltykick.controller;

import java.util.ArrayList;
import java.util.List;
import penaltykick.domain.Guess;
import penaltykick.view.InputView;
import penaltykick.view.OutputView;

public final class InputController {

  private final InputView inputView;
  private final OutputView outputView;

  private final InputValidator inputValidator;


  public InputController(
      final InputView inputView,
      final OutputView outputView,
      final InputValidator inputValidator
  ) {
    this.inputView = inputView;
    this.outputView = outputView;
    this.inputValidator = inputValidator;
  }

  public List<Guess> inputGuess() {
    final List<Guess> guesses = new ArrayList<>();
    outputView.printStartMessage();

    for (int i = 1; i <= 2; ++i) {
      final String guessString = inputView.inputGuess(i);
      inputValidator.validateGuess(guessString);
      guesses.add(Guess.from(guessString));
    }

    return guesses;
  }
}
