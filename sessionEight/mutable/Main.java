public class Main {

  public static void main(String[] args) {
    Car car = new Car("Nissan", 10000);
    car.setMake("Honda");
    Car car2 = car;
    car2.setPrice(8000);
    System.out.println(car); // //Mutable
    System.out.println(car.getPrice());
    System.out.println(car2.getPrice());
  }
}
