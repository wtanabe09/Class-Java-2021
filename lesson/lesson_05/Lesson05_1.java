public class Lesson05_1 {
  public static void main(String[] args) {
    System.out.println("好きな文字列を入力してください");
    while (true){
      System.out.print("input : ");
      String s = new java.util.Scanner(System.in).nextLine();
      if (s.equals("exit")) {
        System.out.println("プログラムを終了します。");
        break;
      }
      System.out.println("output : " + s);
        
    }
  }
}