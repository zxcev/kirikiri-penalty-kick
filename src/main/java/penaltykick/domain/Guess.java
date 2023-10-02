package penaltykick.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class Guess extends GoalPositions {

  private Guess(final List<GoalPosition> goalPositions) {
    super(goalPositions);
  }

  public static Guess from(final String input) {
    final List<GoalPosition> goalPositions = Arrays.stream(input.split(" "))
        .map(GoalPosition::of)
        .collect(Collectors.toList());

    return new Guess(goalPositions);
  }

}
