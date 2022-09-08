public class Parameters {

  public static void main(String[] args) {
    measureRectangle(2.2, 4.3);
    measureRectangle(3.2, 4.1);
    measureRectangle(3.2, 1.2);
    measureRectangle(1.6, 5.6);
    measureRectangle(10.1, 0.7);
    measureRectangle(20.2, 5.6);
  }

  public static void measureRectangle(double length, double width) {
    double area = length * width;
    System.out.println(area);
  }
}
