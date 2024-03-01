public class Study01_5 {
  public static void main(String[] args) {
    int input_1 = Integer.parseInt(args[0]);
    int input_2 = Integer.parseInt(args[1]);
    int count = 0;
    int yakusuu;
    System.out.println("========= " + input_1 + "から" + input_2 + "までの素数" + " =========");
    if (input_1 == 1) {
      input_1 = 2;
    } else if (input_2 == 1) {
      input_2 = 2;
    }
    if (input_1 <= input_2){
      for(int i = input_1; i <= input_2; i++ ){
        yakusuu = 0;
        for(int j = 1; j <= i; j++) {
          if(i % j == 0) {
            yakusuu ++;
          }
        }
        if(yakusuu == 2) {
          System.out.print(i + " ");
          count ++;
          if(count % 12 == 0) {
            System.out.println();
          }
        }
      }
      System.out.println();
      System.out.println("======================================");
    } else {
      for(int i = input_1; i >= input_2; i-- ){
        yakusuu = 0;
        for(int j = 1; j <= i; j++) {
          if(i % j == 0) {
            yakusuu ++;
          }
        }
        if(yakusuu == 2) {
          System.out.print(i + " ");
          count ++;
          if(count % 12 == 0) {
            System.out.println();
          }
        }
      }
      System.out.println();
      System.out.println("======================================");
    }
  }
}