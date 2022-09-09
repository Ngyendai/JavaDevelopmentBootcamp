import java.util.Scanner;

public class Javapedia {

  public static Scanner scan = new Scanner(System.in);
  public static int people = scan.nextInt();
  public static String[][] database = new String[people][3];

  public static void main(String[] args) {
    printRegister();
    print2DArray(database);
    checkName();
  }

  public static void printRegister() {
    System.out.println("many historical figures will you register?");
    scan.nextLine();
    for (int i = 0; i < database.length; i++) {
      System.out.println("\n\tFigure: " + (i + 1));
      System.out.println("\t . Name: ");
      database[i][0] = scan.nextLine();
      System.out.println("\t . Date of birth: ");
      database[i][1] = scan.nextLine();
      System.out.println("\t . Occupation: ");
      database[i][2] = scan.nextLine();
      System.out.println("\n");
    }
  }

  public static void checkName() {
    System.out.println("\nWho do you want information on ?");
    String name = scan.nextLine();
    System.out.println("\n");
    for (int i = 0; i < database.length; i++) {
      if (database[i][0].equals(name)) {
        System.out.println("\tName: " + database[i][0]);
        System.out.println("\tDate of birth: " + database[i][1]);
        System.out.println("\tOccupation: " + database[i][2]);
      }
    }
  }

  public static void print2DArray(String[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.println(array[i][j] + " ");
      }
      System.out.println("\n");
    }
  }
}
