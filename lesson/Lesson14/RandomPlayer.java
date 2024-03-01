import java.util.Random;
public class RandomPlayer implements Player {
  private static Random rand = new java.util.Random(0);
  private int i_rand;
  public int selectHand() {
    i_rand = rand.nextInt(3);
    return i_rand;
  }
}
