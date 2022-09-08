public class WeatherNetwork {

  public static void main(String[] args) {
    int temp = 25;

    String forecast = "";

    //IF - ELSE IF - ELSE STATEMENTS HERE!

    //if temp between -15 and -1:
    if (temp >= -15 && temp < 0) {
      // Print "The forecast is FREEZING! Stay home!"
      System.out.println("The forecast is FREEZING! Stay home!");
      //if temp between 0 and 10:
    } else if (temp <= 0 && temp <= 10) {
      //  Print "The forecast is Chilly. Wear a coat!";
      System.out.println("The forecast is Chilly. Wear a coat!");
    } else {
      //else: It's warm. go outside!
      System.out.println("It's warm. go outside!");
    }

    System.out.println(forecast);
  }
}
