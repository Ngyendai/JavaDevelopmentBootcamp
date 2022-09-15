package Workbook11_1.Workbook11_1;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

  static final String SALES = "data/sales.csv";

  public static void main(String[] args){
    try {
      Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());

      Thread thread2 = new Thread(() -> average(path, "Furniture"));
      Thread thread3 = new Thread(() -> average(path, "Technology"));
      Thread thread4 = new Thread(() -> average(path, "Office Supplies"));
      Thread thread5 = new Thread(() -> totalAverage(path));

      thread2.start();
      thread3.start();
      thread4.start();
      thread5.start();

      Scanner scanner = new Scanner(System.in);
      System.out.println(
        "Please enter your name to access the Global Superstore dataset: "
      );

      String name = scanner.nextLine();
      System.out.println(
        "Access Denied. We apologize for the inconvenience. Have a good day " +
        name
      );

      scanner.close();
    } catch (URISyntaxException e) {
      System.out.println(e.getMessage());
    }
  }

  public static Double average(Path path, String category) {
    try {
      return Files
        .lines(path)
        .skip(1)
        .map(line -> line.split(","))
        .filter(value -> value[0].equals(category))
        .mapToDouble(
          value -> Double.valueOf(value[1]) * Double.valueOf(value[2])
        )
        .average()
        .getAsDouble();
    } catch (IOException ioException) {
      System.out.println(ioException.getMessage());
      return 0.0;
    }
  }

  public static Double totalAverage(Path path) {
    try {
      return Files
        .lines(path)
        .skip(1)
        .map(line -> line.split(","))
        .mapToDouble(
          value -> Double.parseDouble(value[1]) * Double.parseDouble(value[2])
        )
        .average()
        .getAsDouble();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return 0.0;
    }
  }
}
