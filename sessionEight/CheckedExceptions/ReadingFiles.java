import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {

  public static void main(String[] args) {
    try {
      loadData("sessionEight\\CheckedExceptions\\Greetings.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void loadData(String name) throws FileNotFoundException {
    try {
      FileInputStream files = new FileInputStream(name);
      Scanner scan = new Scanner(files);
      while (scan.hasNextLine()) {
        System.out.println(scan.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
