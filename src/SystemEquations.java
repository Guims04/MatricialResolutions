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
