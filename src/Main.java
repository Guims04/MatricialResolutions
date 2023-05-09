import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Matrix matrix = new Matrix();
    ElementFill element = new ElementFill();
    LinearAlgebra calc = new LinearAlgebra();

    int rows, cols;

    // ------------------------------ FIRST MATRIX ------------------------------
//    System.out.print("Informe a quantidade de linhas da primeira matrix: ");
//    rows = input.nextInt();
//    System.out.print("Informe a quantidade de colunas da primeira matrix: ");
//    cols = input.nextInt();
//
//    double[] element1;
//    element1 = element.fill(rows, cols);

//    double[][] M1;
//    M1 = matrix.constructor(rows, cols, element1);
//    matrix.show(M1);

    /*
    System.out.println(matrix.get(0,0, M1));
    matrix.set(0,0, M1, 5);
    matrix.show(M1);
    */

//    System.out.println("transposed matrix");
//    matrix.show(calc.transpose(M1));

    System.out.println("Eliminação Gaussiana");
    // INDETERMINADO
//    double[][] M1 = {
//        {1,0,-2,9},
//        {0,1,1,3},
//    };
    // DETERMINADO
//    double[][] M1 = {
//        {1,2,3},
//        {0,2,5}
//    };
    // IMPOSSÍVEL
//    double[][] M1 = {
//        {1,2,3},
//        {0,1}
//    };
    double[][] M1 = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    matrix.show(calc.gauss(M1));
    matrix.show(calc.solve(M1));

    // ------------------------------ SECOND MATRIX ------------------------------
//    System.out.print("Informe a quantidade de linhas da primeira matrix: ");
//    rows = input.nextInt();
//    System.out.print("Informe a quantidade de colunas da primeira matrix: ");
//    cols = input.nextInt();
//
//    double[] element2;
//    element2 = element.fill(rows, cols);
//
//    double[][] M2;
//    M2 = matrix.constructor(rows, cols, element2);
//    matrix.show(M2);


//    System.out.println("transposed matrix");
//    matrix.show(calc.transpose(M2));

    // ------------------------------ CALCULATIONS ------------------------------
//    System.out.println("Metodo sum");
//    matrix.show(calc.sum(M1,M2));

//    System.out.println("Metodo times com 2 matrizes");
//    matrix.show(calc.times(M1,M2));
//    System.out.println("Metodo times com 1 numero e 1 matriz");
//    matrix.show(calc.times(5,M2));

//    System.out.println("Metodo dot");
//    matrix.show(calc.dot(M1,M2));

  }
}