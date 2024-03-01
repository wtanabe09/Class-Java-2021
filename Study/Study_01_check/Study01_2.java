public class Study01_2 {
  public static void main (String[] args) {
    int num = Integer.parseInt(args[0]);
    for(int i = 1; i <= num; i++) {
      for(int k = 1; k <= num - i; k++) {
        System.out.print(" ");
      }
      for(int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
      if(i == num) {
        for (int l = 0; l <= num - 1; l++) {
          for (int m = 0; m < l; m++) {
            System.out.print(" ");
          }
          for (int n = 0; n <= num * 2 - (l * 2) - 2; n++) {
            System.out.print("*");
          }
          System.out.println();
        }
      }
    } 
  }
}