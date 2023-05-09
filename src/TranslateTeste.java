import LinearTranformation.Translation;
import libs.*;

import java.util.Scanner;

public class TranslateTeste {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Matrix matrix = new Matrix();
    ElementFill element = new ElementFill();
    Translation translation = new Translation();

    int rows;

    // Ask the rows
    System.out.println("Informe a quantidade de linhas do vetor: ");
    rows = input.nextInt();
    // create the element then use it to create the matrix/vector
    double[] element1 = element.fill(rows, 1);
    double[][] v1 = matrix.constructor(rows, 1, element1);
    // Make the translation and print the result
    translation.translate2D(v1,3,2);

    // Ask the rows
    System.out.println("Informe a quantidade de linhas do vetor: ");
    rows = input.nextInt();
    // create the element then use it to create the matrix/vector
    double[] element2 = element.fill(rows, 1);
    double[][] v2 = matrix.constructor(rows, 1, element2);
    // Make the translation and print the result
    translation.translate3D(v2,3,2,4);

  }
}
