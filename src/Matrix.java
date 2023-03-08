public class Matrix {
  double[][] matriz;

  public void constructor(int rows, int cols, double[] elements){
    matriz = new double[rows][cols];
  }

  public double get(int i, int j){
    return matriz[i][j];
  }

  public void set(int i, int j, double value){
    matriz[i][j] = value;
  }
}
