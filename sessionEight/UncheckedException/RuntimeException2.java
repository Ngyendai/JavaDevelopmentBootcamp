public class RuntimeException2 {

  public static void main(String[] args) {
    String word = null;
    try {
      word.toLowerCase();
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }
  }
}
