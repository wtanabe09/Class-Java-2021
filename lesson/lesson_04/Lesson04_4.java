import java.util.Scanner;

public class Lesson04_4 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("試験の点数: ");
    int midterm = scan.nextInt(), finalExam = scan.nextInt();

    /* --- 以下に処理を追加 --- */
    if (midterm + finalExam < 120 || finalExam < 50) {
	System.out.println("F");
    } else {
	int avg = (midterm + finalExam) / 2;
	if (avg >= 90) {
	    System.out.println("AA");
	} else if (avg >= 80) {
	    System.out.println("A");
	} else if (avg >= 70) {
	    System.out.println("B");
	} else if (avg >= 60) {
	    System.out.println("C");
	}
    }
  }
}
