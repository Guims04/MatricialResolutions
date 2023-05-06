import TransformacoesLineares.Translacao;
import libs.*;

import java.util.Scanner;

public class TransformacaoTeste {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Matrix matrix = new Matrix();
    ElementFill element = new ElementFill();
    Translacao translacao = new Translacao();

    // Ask the rows
    System.out.print("Informe a quantidade de linhas do vetor: ");
    int rows = input.nextInt();

    // create the element then use it to create the matrix/vector
    double[] element1 = element.fill(rows, 1);
    double[][] v1 = matrix.constructor(rows, 1, element1);

    translacao.translate2D(v1,3,2);

  }
}
