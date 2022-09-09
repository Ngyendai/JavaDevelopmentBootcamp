public class Prices {

  public static void main(String[] args) {
    //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
    double[][] array2D = new double[3][5];
    // Task 2 - Populate your 2D array with values from the table (see article)
    array2D[0][0] = 20;
    array2D[0][1] = 40;
    array2D[0][2] = 60;
    array2D[0][3] = 80;
    array2D[0][4] = 100;

    array2D[1][0] = 15;
    array2D[1][1] = 30;
    array2D[1][2] = 45;
    array2D[1][3] = 60;
    array2D[1][4] = 75;

    array2D[2][0] = 5;
    array2D[2][1] = 7;
    array2D[2][2] = 9;
    array2D[2][3] = 11;
    array2D[2][4] = 13;

    // Task 3 - Print the prices for each department. See the article for the expected output.
    for (int i = 0; i < array2D.length; i++) {
      switch (i) {
        case 0:
          System.out.print("Baking: ");
          break;
        case 1:
          System.out.print("Beverage: ");
          break;
        case 2:
          System.out.print("Cereals: ");
          break;
      }
      for (int j = 0; j < array2D[i].length; j++) {
        System.out.print(array2D[i][j] + " ");
      }
      System.out.println("\n");
    }
  }
}
