package penaltykick;

import penaltykick.controller.GameController;
import penaltykick.controller.InputController;
import penaltykick.controller.InputValidator;
import penaltykick.util.RandomAnswerGenerator;
import penaltykick.util.RandomGoalPositionGenerator;
import penaltykick.util.RandomNumberGenerator;
import penaltykick.view.InputView;
import penaltykick.view.OutputView;

public final class Application {

  public static void main(final String[] args) {
    final InputView inputView = new InputView();
    final OutputView outputView = new OutputView();
    final InputValidator inputValidator = new InputValidator();
    final InputController inputController = new InputController(inputView, outputView,
        inputValidator);
    final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(1, 3);
    final RandomGoalPositionGenerator randomGoalPositionGenerator = new RandomGoalPositionGenerator(
        randomNumberGenerator);
    final RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator(
        randomGoalPositionGenerator);
    final GameController gameController = new GameController(inputController, outputView,
        randomAnswerGenerator);

    gameController.run();
  }
}
