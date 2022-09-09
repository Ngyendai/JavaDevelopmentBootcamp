import java.util.Arrays;

public class UpdatingArrays {

  public static void main(String[] args) {
    String[] kingdom = { "Dong", "Nguyen", "Dai" };
    kingdom[1] = "Bien";
    String menuString = Arrays.toString(kingdom);
    System.out.println(menuString);
    String[] newKingdom = new String[5];
    for (int i = 0; i < kingdom.length; i++) {
      newKingdom[i] = kingdom[i];
    }
    newKingdom[3] = "Hoa";
    newKingdom[4] = "Nguyen";
    System.out.println(Arrays.toString(newKingdom));
  }
}
