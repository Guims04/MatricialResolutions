public class LinearAlgebra {

  public double[][] transpose(double[][] a){
    double[][] matrix = new double[a.length][a[0].length];
    if (a.length > 0){
      for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[0].length; j++){
          matrix[i][j] = a[j][i];
        }
      }
    }else {
      System.out.println("Matriz não existe ou nula");
    }
    return matrix;
  }
}
