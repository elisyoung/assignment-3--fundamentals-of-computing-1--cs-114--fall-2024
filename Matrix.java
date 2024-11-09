public class Matrix {
  private int[][] matrix;

  public Matrix(int size) {
    int matrixSize = size;
    matrix = new int[matrixSize][matrixSize];
    System.out.println("Your matrix is " + matrix.length + " x " + matrix.length);
  }

  public String printMatrix() {
    String matrixValues = "\n";
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if(row + col == (matrix.length - 1)){
          matrixValues = matrixValues.concat("\u001B[33m" + matrix[row][col] + "\u001B[0m \t");
        } else {
          matrixValues = matrixValues.concat(matrix[row][col] + "\t");
        }
      }
      matrixValues = matrixValues.concat("\n");
    }

    return matrixValues;
  }

  public void populateMatrix() {
    int value = 1;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = value++;
      }
    }
  }

  public void flipMatrix() {
    int topHalfValue;

    for(int row = 0; row < ((matrix.length + 1) / 2); row++){
      for (int col = 0; col < matrix[row].length; col++){
        if(row == matrix.length / 2 && col == matrix.length / 2){
          break;
        } else {
          if(row + col != (matrix.length - 1)){
            swap(row, col, ((matrix.length - 1) - row), ((matrix.length - 1) - col));
          }
        }
      }
    }
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int row1 = x1;
    int col1 = y1;
    int row2 = x2;
    int col2 = y2;

    int value = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = value;
  }

}
