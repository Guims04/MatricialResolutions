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

  public double[][] times(double[][] a, double[][] b) {

    // Creating the final result matrix
    double c[][] = new double[b.length][b[0].length];

    if (a.length == b.length && a[0].length == b[0].length){
      // Multiplying element by element
      for(int i = 0; i < b.length; i++){
        for(int j = 0; j < b[0].length; j++){
            c[i][j]=a[i][j]*b[i][j];
        }
      }
    }else {
      System.out.println("Matrizes com ordem diferentes");
    }

    return c;
  }

  public double[][] times(double value, double[][] b) {

    // creating matrix "a" in a matrix with the same order of "b"
    double[][] a = new double[b.length][b[0].length];
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[0].length; j++){
        a[i][j] = value;
      }
    }

    return times(a,b);
  }

  public double[][] gauss(double[][] a){
    try {
      GaussJordan example = new GaussJordan(a);
      example.eliminate();
      return example.getMatriz();
    } catch (Exception e){
      System.out.println("Matrizes não existe ou nula");
      return null;
    }
  }

  public double[][] solve(double[][] a) {
    SystemEquations verify = new SystemEquations();
    double[][] results = new double[a.length][1];

    if (verify.isPossible(a)){
      if (verify.isDeterminated(a)){
        System.out.println("Sistema Possível Determinado");

        // solve the determined system
        results = verify.solveDeterminate(a);

      }else {
        System.out.println("Sistema Possível Indeterminado");

        // solve the indeterminate system
        verify.solveIndeterminate(a);
      }
    }else {
      System.out.println("Sistema Impossível");
    }
    return results;
  }

}
