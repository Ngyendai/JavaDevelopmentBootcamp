package shopping_cart.models;

public class Item {

  public Item(String name, double price) throws IllegalAccessException {
    if (name == null || name.isBlank()) {
      throw new IllegalAccessException("Name cannot be null or blank");
    }
    if (price < 0) {
      throw new IllegalAccessException("Price cannot be less than zero");
    }
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) throws IllegalAccessException {
    if (name == null || name.isBlank()) {
      throw new IllegalAccessException("Name cannot be null or blank");
    }
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) throws IllegalAccessException {
    if (price < 0) {
      throw new IllegalAccessException("Price cannot be less than zero");
    }
    this.price = price;
  }

  private String name;
  private double price;

  public Item(Item items) {
    this.name = items.name;
    this.price = items.price;
  }

  public String toString() {
    return name + ": $" + price + " ";
  }
}
