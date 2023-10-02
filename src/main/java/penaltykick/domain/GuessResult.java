package penaltykick.domain;

import java.util.List;
import java.util.stream.Collectors;

public final class GuessResult {

  private static int sequence = 1;
  private final int playerNumber;
  private final List<Boolean> guessResults;

  public GuessResult(final List<Boolean> guessResults) {
    this.playerNumber = sequence++;
    this.guessResults = guessResults;
  }

  public static GuessResult of(final List<Boolean> guessResults) {
    return new GuessResult(guessResults);
  }

  @Override
  public String toString() {
    return String.format("플레이어%d : %s", playerNumber, getGuessResultString());
  }

  private String getGuessResultString() {
    return guessResults.stream()
        .map(r -> {
          if (r) {
            return "O";
          }
          return "X";
        }).collect(Collectors.joining());
  }

  public int getPlayerNumber() {
    return playerNumber;
  }

  public int getScore() {
    int score = 0;
    for (final Boolean guessResult : guessResults) {
      if (guessResult) {
        score++;
      }
    }
    return score;
  }
}
