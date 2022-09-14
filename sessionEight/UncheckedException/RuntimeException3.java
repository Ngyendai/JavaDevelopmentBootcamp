import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException3 {

  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a number: ");
      System.out.println(scan.nextInt());
      scan.close();
    } catch (InputMismatchException e) {
      System.out.println(e.getMessage());
    }
  }
}
