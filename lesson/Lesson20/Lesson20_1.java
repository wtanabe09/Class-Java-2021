public class Lesson20_1{
  public static void main(String[] args){
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    System.out.println("sum : " + sum(n1, n2));
    System.out.println("mul : " + mul(n1, n2));
  }
  
  static int sum(int num1, int num2) {
    //-----add here-----
    if(num2 == num1) return num1;
    return sum(num1, num2 - 1) + num2;
  }

  static int mul(int num1, int num2){
    //-----add here-----
    if(num2 == num1) return num1;
    return mul(num1, num2 - 1) * num2;
  }
}
