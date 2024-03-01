public class Hanoi {
  public static void main(String[] args) {
    hanoi(Integer.parseInt(args[0]), 'A', 'B', 'C');
  }
  static void hanoi(int n, char from, char other, char to) {
    if(n == 0) return;
    hanoi(n-1, from, to, other);
    System.out.println("Move disk" + n + ": from " + from + " to " + to);
    hanoi(n-1, other, from, to);
  }
}