public class StringToNumber {
  public static void main(String[] args) {
    double sum = 0.0;
    while(true) {
      System.out.println("数字を入力してください(￥”exit￥”で終了):");
      String input = new java.util.Scanner(System.in).nextLine();
      if(input.equals("exit")) break;
      double d = Double.parseDouble(input);
      sum += d;
      System.out.println("総和： " + sum);
    }
  }
}