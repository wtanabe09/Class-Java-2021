public class Factorial {
  static int count = 0;
  public static void main (String[] args) {
    System.out.println(factorial(5));
    System.out.println(count);
  }
  public static int factorial(int n) {
    count++;
    if(n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}