public class Lesson04_3 {
  public static void main (String[] args) {
    int[] scores = {50, 60, 45, 80, 95, 70, 55, 92, 40, 48};

    /* --- 以下に処理を追加 --- */
    int max = 0;
    int min = 100;
    for (int i = 0; i < scores.length; i++) {
	if (scores[i] > max) {
	    max = scores[i];
	}
	if (scores[i] < min) {
	    min = scores[i];
	}
    }
    System.out.println("最高点：" + max);
    System.out.println("最低点：" + min);
  }
}
