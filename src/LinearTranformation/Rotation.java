package LinearTranformation;

import libs.LinearAlgebra;
import libs.Matrix;

public class Rotation {

    public double[][] rotation2D(double[][] vector, double angle){

      Matrix matrix = new Matrix();
      LinearAlgebra calc = new LinearAlgebra();

      double angleInRadians = Math.toRadians(angle);
      double cos = Math.cos(angleInRadians);
      double sin = Math.sin(angleInRadians);

      double[][] v1 = {
          {vector[0][0]},
          {vector[1][0]},
          {1}
      };
      double[][] MTRotation2D = {
          {cos, -sin, 0},
          {sin, cos, 0},
          {0, 0, 1}
      };

      double[][] result = calc.dot(MTRotation2D, v1);
      matrix.show(result);

      System.out.printf("A posição final do objeto após a translação será (%.2f,%.2f)", result[0][0], result[1][0]);

      return result;
    }

}
