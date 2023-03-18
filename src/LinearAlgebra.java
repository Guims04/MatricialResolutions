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

  double[][] gauss(double[][] a){
    try {
      GaussJordan example = new GaussJordan(a);
      example.eliminate();
      return example.getMatriz();
    } catch (Exception e){
      System.out.println("Matrizes não existe ou nula");
      return null;
    }
  }

  double[][] solve(double[][] a) {
    SystemEquations verify = new SystemEquations();
    double[][] results = new double[a.length][1];

    if (verify.isPossible(a)){
      if (verify.isDeterminated(a)){
        System.out.println("Sistema Possível Determinado");

        // solve the determined system
        double z = a[a.length-1][a[0].length-1];
        results[a.length-1][0] = z;
        for (int i = 2; i <= a.length; i++){
          double last = a[a.length-i][a[0].length-1];
          double func = 0;
          for (int j = 2; j<=i; j++){
            func += a[a.length-i][a[0].length-j]*results[a.length-j+1][0];
          }
          results[a.length-i][0] = (last-func);
        }
      }else {
        System.out.println("Sistema Possível Indeterminado");
        // solve the indeterminate system

      }
    }else {
      System.out.println("Sistema Impossível");
    }
    return results;
  }

}
