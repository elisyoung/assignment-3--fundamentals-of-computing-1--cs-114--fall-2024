public class Matrix {
  private int[][] myMatrix;

  public Matrix(int matrixDimension) {
    int matrixSize = matrixDimension;
    myMatrix = new int[matrixSize][matrixSize];
  }

  public String getMatrix() {
    String matrixValues = "\n";
    for (int row = 0; row < myMatrix.length; row++) {
      for (int col = 0; col < myMatrix[row].length; col++) {
        if(row + col != (myMatrix.length - 1)){
          matrixValues = matrixValues.concat(myMatrix[row][col] + "\t");
        } else {
          matrixValues = matrixValues.concat("\u001B[33m" + myMatrix[row][col] + "\u001B[0m \t");
        }
      }
      matrixValues = matrixValues.concat("\n");
    }

    return matrixValues;
  }

  public void populate() {
    int value = 1;

    for (int row = 0; row < myMatrix.length; row++) {
      for (int col = 0; col < myMatrix[row].length; col++) {
        myMatrix[row][col] = value++;
      }
    }
  }

  public void swapValues() {
    int topHalfValue;

    for(int row = 0; row < ((myMatrix.length + 1) / 2); row++){
      for (int col = 0; col < myMatrix[row].length; col++){
        if(row == myMatrix.length / 2 && col == myMatrix.length / 2){
          break;
        } else {
          if(row + col != (myMatrix.length - 1)){
            topHalfValue = myMatrix[row][col];
            myMatrix[row][col] = myMatrix[(myMatrix.length - 1) - row][(myMatrix.length - 1) - col];
            myMatrix[(myMatrix.length - 1) - row][(myMatrix.length - 1) - col] = topHalfValue;
          }
        }
      }
    }
  }

}
