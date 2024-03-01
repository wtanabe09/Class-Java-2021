public class Study01_1 {
  public static void main (String[] args) {
    while(true) {
      System.out.print("正の整数もしくはexitを入力してください : ");
      String input = new java.util.Scanner(System.in).nextLine();

      if (input.equals("exit")) {
        System.out.println("処理を終了します");
        break;
      } else {
        int num = Integer.parseInt(input);
        for (int i = 0; i < args.length; i++) {
          if (num == args[i].length()) {
            System.out.println(args[i]);
          }
        }
      }
    }
  }
}