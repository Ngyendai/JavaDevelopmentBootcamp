import java.util.Arrays;

public class Reference {

  public static void main(String[] args) {
    String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
    // String[] staffThisYear = new String[3];
    // for (int i = 0; i < staffThisYear.length; i++) {
    //   staffThisYear[i] = staffLastYear[i];
    // }
    String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
    staffThisYear[1] = "Babby";
    System.out.println(Arrays.toString(staffLastYear));
    System.out.println(Arrays.toString(staffThisYear));

    String[] moreItems = new String[staffLastYear.length];
    moreItems[2] = "sofa";
    System.out.println(Arrays.toString(moreItems));
  }
}
