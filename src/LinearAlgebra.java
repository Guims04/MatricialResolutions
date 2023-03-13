public class LinearAlgebra {

  // Make the transpose of the matrix
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

  // inicio do sum nn terminei
  public double[][] sum(double[][] a, double[][] b){
    double[][] matrix = new double[a.length][a[0].length];
    if (a.length > 0 && b.length > 0){
      if (a.length == b.length && a[0].length == b[0].length){
        for (int i = 0; i < a.length; i++){
          for (int j = 0; j < a[0].length; j++){
            matrix[i][j] = a[j][i];
          }
        }
      }else {
        System.out.println("Matrizes não são de mesma ordem");
      }
    }else {
      System.out.println("Matriz não existe ou nula");
    }
    return matrix;
  }

}
