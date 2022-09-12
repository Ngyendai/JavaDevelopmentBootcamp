import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // String[] parts = { "tires", "keys" };
    // Car car = new Car("Car", 5000, 2022, "Red", parts);
    // car.setMake("Cars");
    // double newPrice = car.getPrice() / 2;
    // car.setPrice(newPrice);
    // car.setYear(2023);
    // car.setColor("black");

    // Car dodge = new Car("Dodge", 11000, 2019, "blue", parts);
    // dodge.setMake("Dodges");
    // dodge.setPrice(car.getPrice() / 2);
    // dodge.setYear(2010);
    // dodge.setColor("red");
    // System.out.println(car.getMake());
    // System.out.println(car.getPrice());
    // System.out.println(car.getYear());
    // System.out.println(car.getColor());

    // System.out.println(dodge.getMake());
    // System.out.println(dodge.getPrice());
    // System.out.println(dodge.getYear());
    // System.out.println(dodge.getColor());

    // Car carNew = new Car(car);
    // carNew.setColor("yellow");
    // System.out.println(carNew.getMake());
    // System.out.println(carNew.getPrice());
    // System.out.println(carNew.getYear());
    // System.out.println(carNew.getColor());

    // car.drive();
    // carNew.drive();
    // System.out.println(car);
    // System.out.println(dodge);
    // System.out.println(carNew);

    Car[] cars = new Car[] {
      new Car("Nissan", 11000, 2019, "blue", new String[] { "tires", "keys" }),
      new Car("Dodge", 1100, 2020, "red", new String[] { "tires", "keys" }),
      new Car("Car", 5004, 2022, "black", new String[] { "tires", "filter" }),
      new Car("Honda", 2000, 2023, "pink", new String[] { "tires", "filter" }),
      new Car(
        "Toyota",
        5000,
        2021,
        "orange",
        new String[] { "tires", "filter" }
      ),
    };

    Dealership dealership = new Dealership(cars);
    // for (int i = 0; i < cars.length; i++) {
    //   dealership.setCar(cars[i], i);
    // }
    //dealership.sell(2);
    System.out.println(dealership);
    // dealership.setCar(cars[0], 0);
    // dealership.setCar(cars[1], 1);
    // dealership.setCar(cars[2], 2);
    // Car newCar = dealership.getCar(0);
    // newCar.setColor("yellow");
    // System.out.println(dealership.getCar(0));
  }
}
