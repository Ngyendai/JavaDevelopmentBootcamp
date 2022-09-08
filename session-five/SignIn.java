import java.util.Scanner;

public class SignIn {

  public static void main(String[] args) {
    String username = "Samantha";
    String password = "Java <3";

    /* Task 1 
            1. Pick up a username and password from the user.
       */
    Scanner scan = new Scanner(System.in);
    System.out.println("\nWelcome to Javagram! Sign in below\n");
    System.out.print("• Username: ");
    //pick up username
    String userName = scan.nextLine();
    System.out.print("• Password: ");
    //pick up password
    String passWord = scan.nextLine();
    while (!userName.equals(username) || !passWord.equals(password)) {
      System.out.println("\nIncorrect, please try again!\n");
      System.out.print("• Username: ");
      //pick up username
      userName = scan.nextLine();
      System.out.print("• Password: ");
      //pick up password
      passWord = scan.nextLine();
      System.out.println("\nSign in successful. Welcome!");
    }

    scan.close();
  }
}
