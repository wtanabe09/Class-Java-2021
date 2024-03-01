public class Lesson04_1 {
  public static void main (String[] args) {
    /* --- 以下に処理を追加 --- */
      int rand = new java.util.Random().nextInt(100);

      if (rand % 2 == 0) {
	  System.out.println(rand + "は偶数です");
      } else {
	  System.out.println(rand + "は奇数です");
      }
  }
}
