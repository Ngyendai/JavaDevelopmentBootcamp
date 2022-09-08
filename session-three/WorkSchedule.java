public class WorkSchedule {

  public static void main(String[] args) {
    int day = 3; //3rd day of the week...
    boolean holiday = true;

    // if it's a holiday
    if (holiday) {
      //print: "woohoo, no work!");
      System.out.println("woohoo, no work!");
    }
    // if it's the weekend
    else if (day == 6 || day == 7) {
      // print: "it's the weekend, no work!"
      System.out.println("it's the weekend, no work!");
    } else {
      System.out.println("Wake up at 7:00 :( ");
    }
  }
}
