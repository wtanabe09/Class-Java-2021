import java.util.*;

class Marking {
	private int score[] = new int[10];
	//環境によって違う配列の初期値を統一する目的で初期化を行う. 配列の初期値は0とする.
	// Add here
	private int sum = 0;
	
	Marking() {
		for (int j = 0; j < score.length; j++) {
			score[j] = 0;
		}	
	}

	public void setScore(int array_num, int score) {
		this.score[array_num] = score;
	}
	public int computeSum() {
		sum = 0;
		for (int i = 0; i < score.length; i++) {
			this.sum += score[i];
		}
		return this.sum;
	}
}
