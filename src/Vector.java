public class Vector {
  double[] vector;

  public void constructor(int dim, double[] elements){
    vector = new double[dim];
  }

  public double get(int i){
    return vector[i];
  }

  public void set(int i, double value){
    vector[i] = value;
  }
}
