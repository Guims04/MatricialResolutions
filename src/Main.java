import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Matrix matrix = new Matrix();
    ElementFill element = new ElementFill();

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

    System.out.println(matrix.get(1,1, M1));

    matrix.set(1,1, M1, 23);
    matrix.show(M1);

  }
}