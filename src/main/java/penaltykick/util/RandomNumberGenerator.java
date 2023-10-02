package penaltykick.util;

import java.util.Random;

public final class RandomNumberGenerator {

  private final int min;
  private final int max;
  private final Random rand = new Random();

  public RandomNumberGenerator(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public int generate() {
    return rand.nextInt(max - min + 1) + min;
  }
}
