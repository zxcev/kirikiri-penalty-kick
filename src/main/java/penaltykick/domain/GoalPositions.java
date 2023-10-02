package penaltykick.domain;

import java.util.List;

public class GoalPositions {

  protected final List<GoalPosition> goalPositions;

  protected GoalPositions(final List<GoalPosition> goalPositions) {
    this.goalPositions = goalPositions;
  }

  public List<GoalPosition> getGoalPositions() {
    return goalPositions;
  }
}
