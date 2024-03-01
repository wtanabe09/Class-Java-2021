public class Lesson04_2 {
  public static void main (String[] args) {
    // 標準入力から整数を取得する処理
    System.out.print("自然数を入力してください: ");
    int num = new java.util.Scanner(System.in).nextInt();
    int a = 0;
    /* --- 以下に処理を追加 --- */
    if (num > 0) {
	for (int i = 1; i <= num; i++) {
	    a = a + i;
	}
	System.out.println(a);
    } else {
	System.out.println(num + "は自然数ではありません。");
    }
  }
}
