import java.util.Scanner;

public class Detentions {

  public static void main(String[] args) {
    System.out.println(
      "Hi Bart. I can write lines for you.\nWhat do you want me to write?"
    );
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    for (int i = 0; i <= 99; i++) {
      System.out.println(i + " " + line);
    }
    scan.close();
  }
}
