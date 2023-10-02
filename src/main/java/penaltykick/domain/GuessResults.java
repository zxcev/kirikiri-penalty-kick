package penaltykick.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class GuessResults {

  private final List<GuessResult> guessResults;

  private GuessResults(final List<GuessResult> guessResults) {
    this.guessResults = guessResults;
  }

  public static GuessResults of(final List<GuessResult> guessResults) {
    return new GuessResults(guessResults);
  }

  @Override
  public String toString() {
    return "게임 결과\n" +
        guessResults.stream()
            .map(GuessResult::toString)
            .collect(Collectors.joining("\n")) +
        "\n" +
        getWinnerString();
  }

  private String getWinnerString() {
    final int winnerNumber = guessResults.stream()
        .max(Comparator.comparingInt(GuessResult::getScore))
        .get()
        .getPlayerNumber();

    return String.format("플레이어%d이(가) 우승했습니다🎉", winnerNumber);
  }

}
