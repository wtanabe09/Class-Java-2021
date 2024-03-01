import java.util.Arrays;
import java.util.Random;

public class Lesson26_3 {
	// フィールド
	static final int arraySize = 10000; // 配列の要素数

	// メソッド
	public static void main(String[] args) {
		int[] array = new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			int j = (int)(Math.random() * 100);
			// array[i] = j;
			array[i] = array.length - i;
		}

		System.out.println("array size: " + arraySize);
		System.out.println();

		System.out.println("- InsertionSortX -");
		InsertionSortX is = new InsertionSortX(array);
		is.startTimer();
		is.insertionSortX(); // ソート
		is.stopTimer();	
		System.out.println("Sort: " + is.checkSort());
		System.out.println("assign count: " + is.getAssignCount());
		System.out.println("compare count: " + is.getCompareCount());
		System.out.println("sort time: " + (double)is.getSortTime() / 1000000.0 + "[ms]");

		ShellSort sh = new ShellSort(array); // シェルソート
		System.out.println("- ShellSort -");
		sh.startTimer();
		sh.shellSort(); // ソート
		sh.stopTimer();
		System.out.println("Sort: " + sh.checkSort());
		System.out.println("assign count: " + sh.getAssignCount());
		System.out.println("compare count: " + sh.getCompareCount());
		System.out.println("sort time: " + (double)sh.getSortTime() / 1000000.0 + "[ms]");

		OriginalShellSort osh = new OriginalShellSort(array); // オリジナルシェルソート
		System.out.println("- OriginalShellSort -");
		osh.startTimer();
		osh.originalShellSort(); // ソート
		osh.stopTimer();
		System.out.println("Sort: " + osh.checkSort());
		System.out.println("assign count: " + osh.getAssignCount());
		System.out.println("compare count: " + osh.getCompareCount());
		System.out.println("sort time: " + (double)osh.getSortTime() / 1000000.0 + "[ms]");
	}
}

// array size: 10

// - InsertionSortX -
// Sort: true
// assign count: 45
// compare count: 35
// sort time: 0.012421[ms]
// - ShellSort -
// Sort: true
// assign count: 30
// compare count: 15
// sort time: 0.00742[ms]
// - OriginalShellSort -
// Sort: true
// assign count: 44
// compare count: 22
// sort time: 0.00815[ms]

// array size: 100

// - InsertionSortX -
// Sort: true
// assign count: 2376
// compare count: 2272
// sort time: 0.271711[ms]
// - ShellSort -
// Sort: true
// assign count: 684
// compare count: 342
// sort time: 0.075903[ms]
// - OriginalShellSort -
// Sort: true
// assign count: 1006
// compare count: 503
// sort time: 0.117632[ms]

// array size: 1000

// - InsertionSortX -
// Sort: true
// assign count: 249801
// compare count: 248797
// sort time: 5.488153[ms]
// - ShellSort -
// Sort: true
// assign count: 10914
// compare count: 5457
// sort time: 0.604429[ms]
// - OriginalShellSort -
// Sort: true
// assign count: 16012
// compare count: 8006
// sort time: 1.33462[ms]

// array size: 10000

// - InsertionSortX -
// Sort: true
// assign count: 25062941
// compare count: 25052934
// sort time: 47.874126[ms]
// - ShellSort -
// Sort: true
// assign count: 150486
// compare count: 75243
// sort time: 5.713895[ms]
// - OriginalShellSort -
// Sort: true
// assign count: 240010
// compare count: 120005
// sort time: 11.83187[ms]

// インサーション、オリジナルシェルが持つ問題点
//array_sizeが大きくなったらインサーション、オリジナルともにソートにかかる時間が大幅に増える。
//初期の並び順が降順だった場合、
//インサーションソートではソートの実行時間が圧倒的に大きくなる。
//最悪時間計算量になる。すべて最大ずらさないといけないから。
//オリジナルシェルソートでは偶数なので、比べたところでかぶる部分が多く出てしまう。
//



