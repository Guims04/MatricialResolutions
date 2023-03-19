public class Matrix {

  // Create the matrix
  public double[][] constructor(int rows, int cols, double[] elements){
    double[][] matrix = new double[rows][cols];
    int p = 0;
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        matrix[i][j] = elements[p];
        p++;
      }
    }
    return matrix;
  }

  // get the value of the matrix in a determinate position
  public double get(int i, int j, double[][] m){
    try {
      return m[i][j];
    }catch (Exception e){
      System.out.println("Indice invalido");
      return 0;
    }
  }

  // Set a new value in matrix
  public void set(int i, int j, double[][] m, double value){
    try {
      m[i][j] = value;
    }catch (Exception e){
      System.out.println("Indice ou matriz invalida");
    }
  }

  // Show my matrix in terminal
  public void show(double[][] m){
    if (m.length > 0){
      for (int i = 0; i < m.length; i++){
        System.out.print("| ");
        for (int j = 0; j < m[0].length; j++){
          System.out.print(get(i,j,m)+" ");
        }
        System.out.println("|");
      }
    }else {
      System.out.println("Matriz não existe ou nula");
    }
  }
  public void show(String[][] m){
    if (m.length > 0){
      for (int i = 0; i < m.length; i++){
        System.out.print("| ");
        for (int j = 0; j < m[0].length; j++){
          System.out.print(m[i][j]+" ");
        }
        System.out.println("|");
      }
    }else {
      System.out.println("Matriz não existe ou nula");
    }
  }

  public void toString(String[][] a) {
    String text = "";
    for (int i=0; i<a.length; i++) {
      System.out.print("| ");
      for (int j=0; j<a[i].length; j++) {
        System.out.print(a[i][j]+" ");
      }
      System.out.print("|");
    }
  }
}
