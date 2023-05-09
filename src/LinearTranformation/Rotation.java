package LinearTranformation;

import libs.*;

public class Rotation {

    public double[][] rotation2D(double[][] vector, double angle){

      if (vector.length > 2 || vector[0].length > 1) throw new IllegalArgumentException("Vetor não é 2D");

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

      System.out.printf("A posição final do objeto após a rotação 2D será (%.2f,%.2f)%n", result[0][0], result[1][0]);

      return result;
    }

  public double[][] rotation3DX(double[][] vector, double angle){

      if (vector.length > 3 || vector[0].length > 1) throw new IllegalArgumentException("Vetor não é 3D");

      Matrix matrix = new Matrix();
      LinearAlgebra calc = new LinearAlgebra();

      double angleInRadians = Math.toRadians(angle);
      double cos = Math.cos(angleInRadians);
      double sin = Math.sin(angleInRadians);

      double[][] v1 = {
          {vector[0][0]},
          {vector[1][0]},
          {vector[2][0]}
      };
      double[][] MTRotation3DX = {
          {1, 0, 0},
          {0, cos, -sin},
          {0, sin, cos}
      };

      double[][] result = calc.dot(MTRotation3DX, v1);
      matrix.show(result);

      System.out.printf("A posição final do objeto após a rotação 3DX será (%.2f,%.2f,%.2f)%n", result[0][0], result[1][0], result[2][0]);

      return result;
  }

  public double[][] rotation3DY(double[][] vector, double angle){

      if (vector.length > 3 || vector[0].length > 1) throw new IllegalArgumentException("Vetor não é 3D");

      Matrix matrix = new Matrix();
      LinearAlgebra calc = new LinearAlgebra();

      double angleInRadians = Math.toRadians(angle);
      double cos = Math.cos(angleInRadians);
      double sin = Math.sin(angleInRadians);

      double[][] v1 = {
          {vector[0][0]},
          {vector[1][0]},
          {vector[2][0]},
          {1}
      };
      double[][] MTRotation3DX = {
          {cos, 1, sin, 0},
          {0, 1, 0, 0},
          {-sin, 0, cos, 0},
          {0, 0, 0, 1}
      };

      double[][] result = calc.dot(MTRotation3DX, v1);
      matrix.show(result);

      System.out.printf("A posição final do objeto após a rotação 3DY será (%.2f,%.2f,%.2f) %n", result[0][0], result[1][0], result[2][0]);

      return result;
  }

  public double[][] rotation3DZ(double[][] vector, double angle) {

      if (vector.length > 3 || vector[0].length > 1) throw new IllegalArgumentException("Vetor não é 3D");

      LinearAlgebra calc = new LinearAlgebra();
      Matrix matrix = new Matrix();

      double angleInRadians = Math.toRadians(angle);
      double cos = Math.cos(angleInRadians);
      double sin = Math.sin(angleInRadians);

      double[][] v1 = {
          {vector[0][0]},
          {vector[1][0]},
          {vector[2][0]},
          {1}
      };
      double[][] MTRotation3DZ = {
          {cos, -sin, 0, 0},
          {sin, cos, 0, 0},
          {0, 0, 1, 0},
          {0, 0, 0, 1}
      };

      double[][] result = calc.dot(MTRotation3DZ, v1);
      matrix.show(result);

      System.out.printf("A posição final do objeto após a rotação 3DZ será (%.2f,%.2f,%2f)", result[0][0], result[1][0], result[2][0]);

      return result;

  }

}
