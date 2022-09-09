import java.util.Scanner;

public class Grocer {

  public static Scanner scan = new Scanner(System.in);
  public static String[] store = {
    " apples ",
    "bananas",
    "candy",
    "chocolate",
    "coffee",
    "tea",
  };

  public static void main(String[] args) {
    Grocer1();
    Grocer2();
  }

  public static void Grocer1() {
    System.out.println("\nWelcome to Java Grocers. ");
    System.out.println("\nDo you sell coffee?");
    for (int i = 0; i < store.length; i++) {
      if (store[i].equals("coffee")) {
        System.out.println("\nWe have that in aisle:" + i);
        break;
      }
    }
  }

  public static void Grocer2() {
    System.out.println("\nWelcome to Java Grocers. ");
    System.out.println("What can I help you find?\n");
    String pick = scan.nextLine();
    for (int i = 0; i < store.length; i++) {
      if (store[i].equals(pick)) {
        System.out.println("\nWe have that in aisle: " + i);
        break;
      }
    }
  }
}
