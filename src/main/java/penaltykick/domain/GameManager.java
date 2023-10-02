package penaltykick.domain;

import java.util.List;
import java.util.stream.Collectors;

public final class GameManager {

  private final Answer answer;

  public GameManager(final Answer answer) {
    this.answer = answer;
  }

  public GuessResults play(final List<Guess> guesses) {
    final List<GuessResult> guessResults = guesses.stream()
        .map(answer::guess)
        .collect(Collectors.toList());

    return GuessResults.of(guessResults);
  }
}
