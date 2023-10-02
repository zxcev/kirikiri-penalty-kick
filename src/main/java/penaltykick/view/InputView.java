package penaltykick.view;

import java.util.Scanner;

public final class InputView {

  private final Scanner scanner = new Scanner(System.in);

  public String inputGuess(final int nth) {
    System.out.printf("플레이어%d : ", nth);
    return readLine();
  }

  private String readLine() {
    return scanner.nextLine().trim();
  }
}
