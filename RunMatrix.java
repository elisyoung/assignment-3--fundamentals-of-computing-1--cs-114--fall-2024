import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int matrixSize;

    //get a value from the user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    matrixSize = input.nextInt();
    System.out.println();

    while(matrixSize < 1){
      System.out.print("This value is not positive, enter a positive integer: ");
      matrixSize = input.nextInt();
    }

    input.close();

    Matrix myMatrix = new Matrix(matrixSize);

    System.out.println(myMatrix.getMatrix());


  }


}
