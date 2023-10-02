package penaltykick.domain;

import java.util.Map;

public enum GoalPosition {
  LEFT("1"),
  MID("2"),
  RIGHT("3");

  private static final Map<String, GoalPosition> goalPositions = Map.of(
      "1", LEFT,
      "2", MID,
      "3", RIGHT
  );
  private final String value;

  GoalPosition(final String value) {
    this.value = value;
  }

  public static GoalPosition of(final String value) {
    final GoalPosition goalPosition = goalPositions.get(value);
    if (goalPosition == null) {
      throw new IllegalArgumentException("GoalPosition은 1 ~ 3 사이의 숫자로만 생성할 수 있습니다.");
    }
    return goalPosition;
  }
}
