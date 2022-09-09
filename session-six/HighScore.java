import java.util.Scanner;

public class HighScore {

  public static Scanner scan = new Scanner(System.in);
  public static int highScore = 0;
  public static int sea = 0;
  public static int[] number = {
    randomNumber(),
    randomNumber(),
    randomNumber(),
    randomNumber(),
    randomNumber(),
    randomNumber(),
    randomNumber(),
    randomNumber(),
    randomNumber(),
    randomNumber(),
  };

  public static void main(String[] args) {
    hightScore1();
    hightScore2();
  }

  public static int randomNumber() {
    double random = Math.random() * 50000;
    random += 1;
    int numberInt = (int) random;
    return numberInt;
  }

  public static void hightScore1() {
    for (int i = 0; i < number.length; i++) {
      System.out.println(number[i]);
    }
    System.out.println(number);

    for (int i = 0; i < number.length; i++) {
      if (number[i] > highScore) {
        highScore = number[i];
      }
    }
    System.out.println(
      "\n\nThe highest score is:." + highScore + "Give that man a cookie!"
    );
  }

  public static void hightScore2() {
    for (int i = 0; i < number.length; i++) {
      System.out.println(number[i]);
    }
    System.out.println(number);

    for (int i = 0; i < number.length; i++) {
      if (number[i] > highScore) {
        highScore = number[i];
        sea = i;
      }
    }
    System.out.println(
      "\n\nThe highest score is: " + highScore + ". Impressive!"
    );
    System.out.println(
      "It's the gentleman in seat: " + sea + ". Give that man a cookie!"
    );
  }
}
