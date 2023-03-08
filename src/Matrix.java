public class Matrix {
  double[][] matriz;

  public void constructor(int rows, int cols, double[] elements){
    matriz = new double[rows][cols];
    int p = 0;
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        matriz[i][j] = elements[p];
        p++;
      }
    }
  }

  public double get(int i, int j){
    return matriz[i][j];
  }

  public void set(int i, int j, double value){
    matriz[i][j] = value;
  }
}
