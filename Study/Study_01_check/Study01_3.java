public class Study01_3 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    if (num < 1) {
      System.out.println("1以上の値を入力してください");
    } else if(num == 1){
      System.out.println("1 = 1");
    } else {
      int[] ind = new int[1000];
      int count = 0;
      System.out.print(num + " = ");
      for (int i = 2; i <= num; i++) {
        if (num % i == 0) {
          while (num % i == 0) {
            num /= i;
            ind[i] ++;
          }
          if (count != 0) {
            System.out.print(" * ");
          } else {
            count++;
          }        
          System.out.print(i + "^" + ind[i]);  
        }
      }
      System.out.println();
    }
  }
}