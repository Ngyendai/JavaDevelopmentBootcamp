public class ArrayAndLoops {

  public static void main(String[] args) {
    String[] kingdom = { "Dong", "Nguyen", "Dai" };
    System.out.println(kingdom.length);
    for (int i = 0; i < kingdom.length; i++) {
      System.out.println("The element at index " + i + " is " + kingdom[i]);
    }
    char[] array = { 'q', 'u', 'i', 'z', 'a', 'b' };

    System.out.println(array[array.length]);
  }
}
