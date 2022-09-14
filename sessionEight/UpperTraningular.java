import java.util.Arrays;

public class UpperTraningular {

  public static void main(String[] args) {
    int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (j < 1) {
          matrix[i][j] = 0;
        }
      }
    }
    printArray(matrix);
  }

  public static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array[i]));
    }
  }
}
