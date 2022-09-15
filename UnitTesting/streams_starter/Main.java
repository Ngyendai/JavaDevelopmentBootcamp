import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] numbers = new int[] { 1, 2, 3 };

    int value = Arrays
      .stream(numbers)
      .filter(number -> number < 3)
      .map(number -> number * 2)
      .sum();
  }
}
