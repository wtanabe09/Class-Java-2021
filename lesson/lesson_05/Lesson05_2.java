public class Lesson05_2 {
  public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    while (input <= 0) {
      System.out.print("正の整数を入力してください ");
      input = new java.util.Scanner(System.in).nextInt();
    }
    for (int i = 1; i <= input; i++) {
      for (int k = input - i; k > 0; k--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1 ; j ++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}