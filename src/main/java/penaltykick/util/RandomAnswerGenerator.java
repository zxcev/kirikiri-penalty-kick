package penaltykick.util;

import java.util.ArrayList;
import java.util.List;
import penaltykick.domain.Answer;
import penaltykick.domain.GoalPosition;

public final class RandomAnswerGenerator {

  private final RandomGoalPositionGenerator randomGoalPositionGenerator;

  public RandomAnswerGenerator(final RandomGoalPositionGenerator randomGoalPositionGenerator) {
    this.randomGoalPositionGenerator = randomGoalPositionGenerator;
  }

  public Answer generate() {
    final List<GoalPosition> goalPositions = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      final GoalPosition goalPosition = randomGoalPositionGenerator.generate();
      goalPositions.add(goalPosition);
    }

    return Answer.of(goalPositions);
  }
}
