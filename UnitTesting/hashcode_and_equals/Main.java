import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    Car car = new Car("Dodge", 2018);
    System.out.println("Dodge:" + car.hashCode());
    Car car1 = new Car("Dodges", 2019);
    System.out.println("Dodge:" + car1.hashCode());
    Car car3 = new Car(car);
    System.out.println("Dodge:" + car3.hashCode());

    HashMap<Car, Double> prices = new HashMap<Car, Double>();
    prices.put(car, 10000.);
    prices.put(car1, 12000.);

    car.equals(car3);
    System.out.println(prices.get(car3));
  }
}
