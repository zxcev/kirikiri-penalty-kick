package penaltykick.view;

import penaltykick.domain.GuessResults;

public final class OutputView {

  public void printStartMessage() {
    System.out.println("패널티 킥 게임을 시작합니다.");
    System.out.println("총 5번의 위치를 입력해주세요.");
  }

  public void printResults(final GuessResults results) {
    System.out.println(results);
  }
}
