public class Lesson20_2{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println("10進数 : " + n);
    System.out.print("2進数  : ");
    binary(n);
    System.out.println();
  }

  static void binary(int num) {
    //-----add here-----
    if(num <= 0) return;
    binary(num / 2);
    System.out.print(num % 2);
  } 
}
