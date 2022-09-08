import java.util.Scanner;

public class DiceJack {

  public static void main(String[] args) {
    int rol1 = rollDice();
    int rol2 = rollDice();
    int rol3 = rollDice();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter three numbers between 1 and 6");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    if (num1 < 1 || num2 < 1 || num3 < 1) {
      System.out.println("Numbers cannot be less than 1. Shutting game down");
      System.exit(0);
    }
    if (num1 > 6 || num2 > 6 || num3 > 6) {
      System.out.println("Numbers cannot be less than 6. Shutting game down");
      System.exit(0);
    }

    int sumOfNumbers = num1 + num2 + num3;
    int sumDiceRolls = rol1 + rol2 + rol3;
    System.out.println(
      "Dice sum = " + sumDiceRolls + " . Number sum = " + sumOfNumbers
    );
    if (checkWin(sumDiceRolls, sumOfNumbers)) {
      System.out.println("Congrats, you win!");
    } else {
      System.out.println("Sorry! You less");
    }
    scan.close();
  }

  public static int rollDice() {
    double randomNumber = Math.random() * 6;
    randomNumber += 1;
    return (int) randomNumber;
  }

  public static boolean checkWin(int diceSum, int numberSum) {
    return (diceSum < numberSum && numberSum - diceSum < 3);
  }
}
