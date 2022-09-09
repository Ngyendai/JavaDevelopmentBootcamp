public class Receipt {

  public static void main(String[] args) {
    String[] store = { "apple", "coffee" };
    int[] price = { 20, 30 };
    System.out.println("Here's your receipt:\n");
    for (int i = 0; i < store.length; i++) {
      System.out.println(" \t" + store[i] + ": $" + price[i]);
    }
  }
}
