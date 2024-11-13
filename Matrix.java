public class Matrix {
  private int[][] matrix;

  //Constructor: sets up the matrix and prints the size
  public Matrix(int size) {
    int matrixSize = size;
    matrix = new int[matrixSize][matrixSize];
    System.out.println("Your matrix is " + matrix.length + " x " + matrix.length + "\n");
  }

  //returns the matrix as a string with the diagonal highlighted
  public void printMatrix() {
    final String YELLOW = "\u001B[33m";
    final String RESET = "\u001B[0m";
    String matrixValues = "\n";

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if(row + col == (matrix.length - 1)){    //highlights the diagonal
          matrixValues = matrixValues.concat(YELLOW + matrix[row][col] + RESET + " \t");
        } else {
          matrixValues = matrixValues.concat(matrix[row][col] + "\t");
        }
      }

      matrixValues = matrixValues.concat("\n");
    }

    System.out.println(matrixValues);
  }

  //populates the matrix with values from 1 to (size × size)
  public void populateMatrix() {
    int value = 1;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = value++;
      }
    }
  }

  //flips the matrix values across the diagonal, skipping over values in the diagonal
  public void flipMatrix() {
    for(int row = 0; row < ((matrix.length + 1) / 2); row++){
      for (int col = 0; (col < matrix[row].length) && ((row != matrix.length / 2) || (col != matrix.length / 2)); col++){
        if(row + col != (matrix.length - 1)){  //no change to values in the diagonal
          swap(row, col, ((matrix.length - 1) - row), ((matrix.length - 1) - col));
        }
      }
    }
  }

  //swaps the values of matrix[x1][y1] and matrix[x2][y2]
  private void swap(int x1, int y1, int x2, int y2) {
    int row1 = x1;
    int col1 = y1;
    int row2 = x2;
    int col2 = y2;
    int valueToSwap;

    valueToSwap = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = valueToSwap;
  }
}
