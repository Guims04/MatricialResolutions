package libs;

/**
 * A libs.GaussJordan object holds a two dimensional array representing a matrix
 * containing a system of equations. Contains methods for performing a
 * Gauss-Jordan Elimination and putting a matrix into Reduced Row Echelon Form
 *
 * @author Thomas Coe
 * @version 1.0 October 8th, 2013
 */
public class GaussJordan{

  private double[][] augmentedMatrix;

  /**
   * Constructor for a libs.GaussJordan object. Takes in a two dimensional double
   * array holding the matrix.
   *
   * @param matrix A double[][] containing the augmented matrix
   */
  public GaussJordan(double[][] matrix) {
    augmentedMatrix = matrix;
  }

  /**
   * Runs a Gauss-Jordan elimination on the augmented matrix in order to put
   * it into reduced row echelon form
   *
   */
  public void eliminate() {
    int startColumn = 0;
    for (int row=0; row<augmentedMatrix.length; row++) {

      //if the number in where should be the pivot number of each column is 0, try to switch with another row
      for (int i = 0; i < augmentedMatrix.length; i++){
        if (augmentedMatrix[row][startColumn] == 0 && augmentedMatrix[i][startColumn] != 0){
          double[] temp = augmentedMatrix[i];
          augmentedMatrix[i]=augmentedMatrix[row];
          augmentedMatrix[row]=temp;
        }
      }

      //if the number isn't one, reduce to one
      if(augmentedMatrix[row][startColumn]!=1.0 && augmentedMatrix[row][startColumn]!=0) {
        double divisor = augmentedMatrix[row][startColumn];
        for (int i=0; i<augmentedMatrix[row].length; i++) {
          augmentedMatrix[row][i] = augmentedMatrix[row][i]/divisor;
        }
      }

      //make sure the number in the start column of all other rows is 0
      for (int i=row; i<augmentedMatrix.length; i++) {
        if (i!=row && augmentedMatrix[i][startColumn]!=0) {
          double multiple = 0-augmentedMatrix[i][startColumn];
          for (int j=startColumn; j<augmentedMatrix[row].length; j++){
            augmentedMatrix[i][j] +=
                multiple*augmentedMatrix[row][j];
          }
        }
      }


      if (startColumn < augmentedMatrix[0].length-1) startColumn++;
    }
  }

  public double[][] getMatriz(){
    return augmentedMatrix;
  }

  /**
   * Returns a String with the contents of the augmented matrix.
   *
   * @return A String representation of the augmented matrix
   */
  public String toString() {
    String text = "";
    for (int i=0; i<augmentedMatrix.length; i++) {
      for (int j=0; j<augmentedMatrix[i].length; j++) {
        text+=augmentedMatrix[i][j] + ", ";
      }
      text+="\n";
    }
    return text;
  }
}


//class MathDriver {
//  public static void main(String[] args) {
//    double[][] array1 = {
//        {1,0,-2,9},
//        {0,1,1,3}
//    };
//    libs.GaussJordan example = new libs.GaussJordan(array1);
//    example.eliminate();
//    System.out.println(example);
//  }
//}








//      while (augmentedMatrix[row][startColumn]==0.0){
//        boolean switched = false;
//        int i=row;
//        while (!switched && i<augmentedMatrix.length) {
//          if(augmentedMatrix[i][startColumn]!=0.0){
//            double[] temp = augmentedMatrix[i];
//            augmentedMatrix[i]=augmentedMatrix[row];
//            augmentedMatrix[row]=temp;
//            switched = true;
//          }
//          i++;
//        }
//        //if after trying to switch, it is still 0, increase column
//        if (augmentedMatrix[row][startColumn]==0.0) {
//          startColumn++;
//        }
//      }