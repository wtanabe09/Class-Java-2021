public class Lesson04_5 {
  public static void main (String[] args) {
    /* --- 以下に処理を追加 --- */
      int timesTable[][] = new int[9][9];
      for ( int i = 0; i < 9; i++ ) {
	  for ( int j = 0; j < 9; j++) {
	      timesTable[i][j] = (i + 1) * (j + 1);
	      System.out.print(timesTable[i][j] + " ");
	  }
	  System.out.println();
      }
      
  }
}
