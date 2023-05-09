package LinearTranformation;
import libs.*;

public class Reflection {

  public double[][] reflection2DX(double[][] vector){
    Matrix matrix = new Matrix();
    LinearAlgebra calc = new LinearAlgebra();

    double[][] reflectionMatrix = {
        {1, 0, 0},
        {0, -1, 0},
        {0, 0, 1}
    };

    double[][] v1 = {
        {vector[0][0]},
        {vector[1][0]},
        {1}
    };

    double[][] result = calc.dot(reflectionMatrix, v1);
    matrix.show(result);

    System.out.printf("A posição final do objeto após a reflexão será (%.2f,%.2f)", result[0][0], result[1][0]);

    return result;
  }

}
