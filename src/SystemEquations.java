public class SystemEquations {
  boolean isPossible(double[][] a){
    for (int i = 0; i < a.length; i++){
      int zerosInRow = 0;
      for (int j = 0; j < a[0].length; j++){
        if (a[i][j] == 0){
          zerosInRow++;
        }
      }
      if (zerosInRow == a[0].length-1) {
        return false;
      }
    }
    return true;
  }

  boolean isDeterminated(double[][] a) {
    int pivotAmount = 0;
    for (int i = 0; i < a.length; i++) {
      if (a.length == a[0].length - 1 && a[i][i] == 1) pivotAmount++;
    }
    if (pivotAmount == a[0].length-1) {return true;} else {return false;}
  }

}




//        for (int row=0; row<a.length; row++) {
//          int startColumn = 0;
//          for (int i=0; i<a.length; i++) {
//            if (i!=row && a[i][startColumn]!=0) {
//              double multiple = 0-a[i][startColumn];
//              for (int j=startColumn; j<a[row].length; j++){
//                a[i][j] += multiple*a[row][j];
//              }
//            }
//          }
//          if (startColumn < a[0].length-1) startColumn++;
//        }
//        for (int i = 0; i < a.length; i++){
//          for (int j = 0; j < a[0].length; j++){
//            System.out.print(a[i][j]+" ");
//          }
//          System.out.println("");
//        }
