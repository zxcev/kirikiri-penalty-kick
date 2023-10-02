package penaltykick.util;

import penaltykick.domain.GoalPosition;

public final class RandomGoalPositionGenerator {

  private final RandomNumberGenerator randomNumberGenerator;

  public RandomGoalPositionGenerator(final RandomNumberGenerator randomNumberGenerator) {
    this.randomNumberGenerator = randomNumberGenerator;
  }

  public GoalPosition generate() {
    final int number = randomNumberGenerator.generate();
    return GoalPosition.of(String.valueOf(number));
  }
}
