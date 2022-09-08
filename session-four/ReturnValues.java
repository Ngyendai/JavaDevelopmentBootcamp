public class ReturnValues {

  public static void main(String[] args) {
    stringPrint();
  }

  public static double measureRectangle(
    double length,
    double width,
    String option
  ) {
    switch (option) {
      case "area":
        return length * width;
      case "perimeter":
        return 2 * (length * width);
      default:
        return 404;
    }
  }

  public static void stringPrint() {
    System.out.println(measureRectangle(2.2, 4.3, "area"));
    System.out.println(measureRectangle(3.2, 4.1, "perimeter"));
  }
}
