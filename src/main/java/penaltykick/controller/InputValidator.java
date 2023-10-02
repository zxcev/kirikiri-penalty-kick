package penaltykick.controller;

import java.util.regex.Pattern;

public final class InputValidator {

  private final String guessPattern = "^\\d+( \\d+){4}$";

  public void validateGuess(final String guessString) {
    if (!Pattern.matches(guessPattern, guessString)) {
      throw new IllegalArgumentException(
          "유효하지 않은 입력입니다. `플레이어1 : 1 2 3 2 1`와 같이 숫자, 공백으로 이루어진 5개의 숫자 입력을 부탁드립니다.");
    }
  }
}
