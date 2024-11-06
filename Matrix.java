public class Matrix {
  private String matrixValues;
  private int[][] myMatrix;
  private int matrixSize;

  public Matrix(int matrixDimension) {
    matrixSize = matrixDimension;
    myMatrix = new int[matrixSize][matrixSize];
  }

  public String getMatrix() {
    matrixValues = "\n";
    for (int row = 0; row < myMatrix.length; row++) {
      for (int col = 0; col < myMatrix[row].length; col++) {
        matrixValues = matrixValues.concat(myMatrix[row][col] + "\t");
      }
      matrixValues = matrixValues.concat("\n");
    }

    return matrixValues;
  }


}
