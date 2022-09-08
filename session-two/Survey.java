import java.util.Scanner;

public class Survey {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    System.out.println("\nWhat is your name");
    String name = scanner.nextLine();
    counter++;

    System.out.println("\nBao nhiêu tiền cho 1 ly coffee");
    double coffeePrice = scanner.nextDouble();
    counter++;

    System.out.println("\nBạn uống coffee 1 tuần bao nhiêu ngày");
    int coffeeAmount = scanner.nextInt();
    counter++;

    System.out.println("\nBạn chi bao nhiêu tiền để mua thức ăn nhanh");
    int foodAmount = scanner.nextInt();
    counter++;
    System.out.println(
      "\nCảm ơn bạn" + name + "đã trả lời " + counter + "câu hỏi"
    );

    scanner.close();
  }
}
