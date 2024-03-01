public class Num{

  public void add(int num1, int num2){
    int add_num = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + add_num);
  }

  public void sub(int num1, int num2){
    int sub_num = num1 - num2;
    System.out.println(num1 + " - " + num2 + " = " + sub_num);
  }

  // Add here (Lesson07_2) ====================================
  public void mul(int num1, int num2) {
    int mul_num = num1 * num2;
    System.out.println(num1 + " * " + num2 + " = " + mul_num ); 
  }
  public void div(int num1, int num2) {
   if (num2 == 0) {
      System.out.println(num1 + " / " + num2 + "はゼロ除算です。");
    } else {
      int div_num = num1 / num2;
      System.out.println(num1 + " / " + num2 + " = " + div_num );
    }
  }
  public void rem(int num1, int num2) {
    if (num2 == 0) {
      System.out.println(num1 + " % " + num2 + "はゼロ除算です。");
    } else {
      int rem_num = num1 % num2;
      System.out.println(num1 + " % " + num2 + " = " + rem_num );
    }
  }

}
