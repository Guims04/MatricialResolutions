import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Matrix matrix = new Matrix();
    ElementFill element = new ElementFill();
    LinearAlgebra calc = new LinearAlgebra();

    int rows, cols;
    System.out.print("Informe a quantidade de linhas da primeira matrix: ");
    rows = input.nextInt();
    System.out.print("Informe a quantidade de colunas da primeira matrix: ");
    cols = input.nextInt();

    double[] element1;
    element1 = element.fill(rows, cols);

    double[][] M1;
    M1 = matrix.constructor(rows, cols, element1);
    matrix.show(M1);

    System.out.println(matrix.get(0,0, M1));

    matrix.set(0,0, M1, 5);
    matrix.show(M1);

    System.out.println("transposed matrix");
    matrix.show(calc.transpose(M1));


    System.out.print("Informe a quantidade de linhas da primeira matrix: ");
    rows = input.nextInt();
    System.out.print("Informe a quantidade de colunas da primeira matrix: ");
    cols = input.nextInt();

    double[] element2;
    element2 = element.fill(rows, cols);

    double[][] M2;
    M2 = matrix.constructor(rows, cols, element2);
  }
}