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
        if(row + col != (matrix.length - 1)){
          matrixValues = matrixValues.concat(matrix[row][col] + "\t");
        } else {
          matrixValues = matrixValues.concat("\u001B[33m" + matrix[row][col] + "\u001B[0m \t");
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
            topHalfValue = matrix[row][col];
            matrix[row][col] = matrix[(matrix.length - 1) - row][(matrix.length - 1) - col];
            matrix[(matrix.length - 1) - row][(matrix.length - 1) - col] = topHalfValue;
          }
        }
      }
    }
  }


}
