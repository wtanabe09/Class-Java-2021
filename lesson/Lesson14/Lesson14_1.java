class Lesson14_1 {
    final static String[] RESULTS_STRING = {"引分","勝ち","負け"};
    public static void main(String[] args){
			java.util.Scanner scan = new java.util.Scanner(System.in);
			Player p1 = new RandomPlayer();
			Player p2 = new RandomPlayer();
			final int REP = 10000;
			int[] results = {0,0,0};
			for (int ri=0; ri<REP; ri++) {
					final int fHand = p1.selectHand();
					final int sHand = p2.selectHand();
					final int RES = (fHand + 3 - sHand)%3;
					results[RES]++;
			}
			for (int i=0; i<3; i++) {
					System.out.println(RESULTS_STRING[i] + ": " + results[i]);
			}
    }
}
