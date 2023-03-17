public class LinearAlgebra {

  // Make the transpose of the matrix
  public double[][] transpose(double[][] a){
    double[][] matrix = new double[a[0].length][a.length];
    if (a.length > 0){
      for (int i = 0; i < a[0].length; i++){
        for (int j = 0; j < a.length; j++){
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
    try {
        for (int i = 0; i < a.length; i++){
          for (int j = 0; j < a[0].length; j++){
            matrix[i][j] = a[i][j]+b[i][j];
          }
        }
      return matrix;
    }catch (Exception e){
      System.out.println("Matrizes não são de mesma ordem, não existe ou nula");
      return null;
    }
  }

  double[][] gauss(double[][] array){
    try {
      GaussJordan example = new GaussJordan(array);
      example.eliminate();
      return example.getMatriz();
    } catch (Exception e){
      System.out.println("Matrizes não existe ou nula");
      return null;
    }
  }

}
