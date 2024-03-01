//インデントがだめだよ
//一行に２つ処理書いたらみにくいよ
//引数の入力がつかわれていない
//コメントが全般的に少ないよね



import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BadProgram {
    private final static int SIZE = 4;
    static JTextField[] ansBox;
    static JTextArea result;
    static int guessCount = 0;
 
    static int[] correct;
    public static void main(String[] args) {
	guessCount = 0;
        correct = GenProblem(SIZE);
	JFrame FRAME = new JFrame("Hit & Blow Game");
	FRAME.setBounds(200, 200, 200, 400);
	FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	FRAME.getContentPane().add(createPanel());
	FRAME.setVisible(true);
    }

    static int[] GenProblem(int num) {
	Random rand = new Random();
	int[] permutation = new int[10];
	for (int i = 0; i < 10; i++) {
	    int j = rand.nextInt(i+1);
	    permutation[i] = permutation[j]; 
	    permutation[j] = i;
	}
	int[] ret = new int[SIZE];
	for (int i = 0; i < SIZE; i++) {
	    ret[i] = permutation[i];
	}
	return ret;
    }
}
