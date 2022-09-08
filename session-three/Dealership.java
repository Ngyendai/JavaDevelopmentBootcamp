import java.util.Scanner;

public class Dealership {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Chào mừng bạn đến với Java Dealership");
    System.out.println("Mời chọn a để mua 1 chiếc ô tô");
    System.out.println("Mời chọn b để bán 1 chiếc ô tô");
    String option = scan.nextLine();
    switch (option) {
      case "a":
        System.out.println("tôi chọn " + option);
        break;
      case "b":
        System.out.println("tôi chọn " + option);
        break;
      default:
        System.out.println("Tôi không chọn");

        scan.close();
    }
  }
}
