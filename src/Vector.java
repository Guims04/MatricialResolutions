public class Vector {
  double[][] vector;

  public void constructor(int dim, double[] elements){
    vector = new double[dim][1];
  }

  public double get(int i){
    return vector[i][1];
  }

  public void set(int i, double value){
    vector[i][1] = value;
  }
}
