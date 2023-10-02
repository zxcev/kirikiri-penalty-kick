package penaltykick.controller;

import java.util.List;
import penaltykick.domain.Answer;
import penaltykick.domain.GameManager;
import penaltykick.domain.Guess;
import penaltykick.domain.GuessResults;
import penaltykick.util.RandomAnswerGenerator;
import penaltykick.view.OutputView;

public final class GameController {

  private final InputController inputController;
  private final OutputView outputView;

  private final RandomAnswerGenerator randomAnswerGenerator;

  public GameController(
      final InputController inputController,
      final OutputView outputView,
      final RandomAnswerGenerator randomAnswerGenerator
  ) {
    this.inputController = inputController;
    this.outputView = outputView;
    this.randomAnswerGenerator = randomAnswerGenerator;
  }

  public void run() {
    final List<Guess> guesses = inputGuesses();
    final GuessResults results = play(guesses);
    outputView.printResults(results);
  }

  private GameManager createGameManager() {
    final Answer answer = randomAnswerGenerator.generate();
    return new GameManager(answer);
  }

  private List<Guess> inputGuesses() {
    return inputController.inputGuess();
  }

  private GuessResults play(final List<Guess> guesses) {
    final GameManager gameManager = createGameManager();
    return gameManager.play(guesses);
  }
}
