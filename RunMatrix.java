import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int matrixSize;

    //get a value from the user
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter the size of your matrix: ");
    matrixSize = input.nextInt();
    System.out.println();

    //checks that the input is positive
    while(matrixSize < 1){
      System.out.print("This value is not positive, enter a positive integer: ");
      matrixSize = input.nextInt();
    }

    input.close();

    //creates a Matrix object and carries out its methods
    Matrix myMatrix = new Matrix(matrixSize);
    System.out.println("Printing matrix with default values:" + myMatrix.printMatrix());

    myMatrix.populateMatrix();
    System.out.println("Populating values...\n");
    System.out.println("Printing matrix:" + myMatrix.printMatrix());

    myMatrix.flipMatrix();
    System.out.println("Flipping matrix...\n");
    System.out.println("Printing flipped matrix:" + myMatrix.printMatrix());

  }


}
