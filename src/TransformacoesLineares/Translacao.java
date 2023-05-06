package TransformacoesLineares;
import libs.*;

public class Translacao {

  public double[][] translate2D(double[][] vector, double dx, double dy){

    if (vector.length > 2 || vector[0].length > 1) throw new IllegalArgumentException("Vetor não é 2D");

    Matrix matrix = new Matrix();
    LinearAlgebra calc = new LinearAlgebra();

    double[][] v1 = {
        {vector[0][0]},
        {vector[1][0]},
        {1}
    };
    double[][] MTranf2D = {
        {1,0,dx},
        {0,1,dy},
        {0,0,1}
    };

    double[][] result = calc.dot(MTranf2D, v1);
    matrix.show(result);

    System.out.println("A posição final do objeto após a translação será ("+result[0][0]+","+result[1][0]+")");
    return result;
  }

  public double[][] translate3D(double[][] vector, double dx, double dy){
    return vector;
  }

}
