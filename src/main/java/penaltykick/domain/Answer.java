package penaltykick.domain;

import java.util.ArrayList;
import java.util.List;

public final class Answer extends GoalPositions {

  private Answer(final List<GoalPosition> goalPositions) {
    super(goalPositions);
  }

  public static Answer of(final List<GoalPosition> goalPositions) {
    return new Answer(goalPositions);
  }

  public GuessResult guess(final Guess guess) {
    final List<Boolean> guessResults = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      final boolean guessResult = isCorrectAt(i, guess.getGoalPositions());
      guessResults.add(guessResult);
    }

    return GuessResult.of(guessResults);
  }

  private boolean isCorrectAt(
      final int index,
      final List<GoalPosition> guess
  ) {
    return goalPositions.get(index) == guess.get(index);
  }
}
