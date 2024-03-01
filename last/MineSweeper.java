import java.util.Random;

interface MineSweeperGUI {
  public void setTextToTile(int x, int y, String text);
  public String getTileLabel(int x, int y);
  public void setDefaultColor(int x, int y);
  public void setFlagColor(int x, int y);
  public void resetFlagColor(int x, int y);
  public void setLoseColor();
  public void setWinColor();
  public void win();
  public void lose();
}

public class MineSweeper {
  private final int height;
  private final int width;
  private final int numTile;
  private final int numMine;
  private final int[][] table;
  private int c_count = 0;

  public MineSweeper(int height, int width, int numMine) {
    this.height = height;
    this.width = width;
    this.numTile = height * width;
    this.numMine = numMine;
    this.table = new int [height][width];

    initTable();
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  void initTable() {
    setMine();
    /* ----- add implementation here ----- */
    for(int i = 0; i < width; i++) {
      for(int j = 0; j < height; j++) {
        // ボムの周りの数字を加算
        if(table[i][j] < 0){
          if(i > 0) table[i-1][j]++; if(i+1 < width)table[i+1][j]++;//左右
          if(j > 0) table[i][j-1]++; if(j+1 < height) table[i][j+1]++;//上下
          if(i > 0 && j+1 < height) table[i-1][j+1]++; if(i+1 < width && j+1 < height) table[i+1][j+1]++;//下斜め
          if(i > 0 && j > 0) table[i-1][j-1]++; if(i+1 < width && j > 0)table[i+1][j-1]++;//上斜め
        }
      }
    }
    showTable();
  }

  void setMine() {
    /* ----- add implementation here ----- */
    Random rand = new Random();
    int r_x, r_y; int c = 0;
    while(c < numMine) {
      r_x = rand.nextInt(9); r_y = rand.nextInt(9);
      while(table[r_x][r_y] <= -90) {
        r_x = rand.nextInt(9); r_y = rand.nextInt(9); //すでにボムがおいてある場合は、再度座標を生成。
      }
      table[r_x][r_y] = -90; //ボムセット
      c++;
    }
  }

  public void showTable() {
    //デバック用テーブルの中身表示
    for(int i = 0; i < height; i++) {
      for(int j = 0; j < width; j++) {
        if (table[j][i] >= 0) {
          System.out.print(table[j][i] + "    ");
        } else {
          System.out.print(table[j][i] + "  ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public void openTile(int x, int y, MineSweeperGUI gui) {
    /* ----- add implementation here ----- */
    String text;
      while (c_count == 0 && table[x][y] != 0) {
        this.resetTable(); //最初にクリックしたところがボムだったらテーブルをリセット。
      }
      if (gui.getTileLabel(x, y) != "F") {
        text = Integer.toString(table[x][y]);
        if(table[x][y] < 0) {
          text = "Boo";
          openAllTiles(gui); gui.setLoseColor(); gui.lose(); //全部開ける、ユーザー負ける。
        }
        c_count++;
        gui.setTextToTile(x, y, text);
        zeroCheck(x, y, gui);
      }
    winJudege(gui);
  }

  public void setFlag(int x, int y, MineSweeperGUI gui) {
    /* ----- add implementation here ----- */
    if(gui.getTileLabel(x, y) != "F") {
      gui.setTextToTile(x, y, "F");
      gui.setFlagColor(x, y);
    } else {
      gui.setTextToTile(x, y, "");
      gui.resetFlagColor(x, y);
      gui.setDefaultColor(x, y);
    }
  }

  public void openAllTiles(MineSweeperGUI gui) {
    /* ----- add implementation here ----- */
    String text;
    for(int i = 0; i < width; i++) {
      for(int j = 0; j < height; j++) {
        if(table[i][j] < 0) {
          text = "Boo";
        } else {
          text = Integer.toString(table[i][j]);
        }
        gui.setTextToTile(i, j, text);
      }
    }
  }

  public void resetTable() {
    for(int i = 0; i < width; i++){
      for(int j = 0; j < height; j++){
        this.table[i][j] = 0;
      }
    }
    this.initTable();
  }

  public void zeroCheck(int x, int y, MineSweeperGUI gui){
    //ゼロだったら隣接するところオープンする（カチカチするのめんどくさいから）
    if(table[x][y] == 0) {
      if(x > 0){
        gui.setTextToTile(x-1, y, Integer.toString(table[x-1][y]));
      }
      if(x+1 < width){
        gui.setTextToTile(x+1, y, Integer.toString(table[x+1][y]));
      }
      if(y > 0){
        gui.setTextToTile(x, y-1, Integer.toString(table[x][y-1]));
      }
      if(y+1 < height){
        gui.setTextToTile(x, y+1, Integer.toString(table[x][y+1]));
      }
      if(x > 0 && y > 0){
        gui.setTextToTile(x-1, y-1, Integer.toString(table[x-1][y-1]));
      }
      if(x+1 < width && y > 0){
        gui.setTextToTile(x+1, y-1, Integer.toString(table[x+1][y-1]));
      }
      if(x > 0 && y+1 < height){
        gui.setTextToTile(x-1, y+1, Integer.toString(table[x-1][y+1]));
      }
      if(x+1 < width && y+1 < height){
        gui.setTextToTile(x+1, y+1, Integer.toString(table[x+1][y+1]));
      }
    }
  }

  public void winJudege(MineSweeperGUI gui) {
    int win_count = 0;
    for(int i = 0; i < height; i++){
      for(int j = 0; j < width; j++) {
        if(gui.getTileLabel(j, i).equals("") || gui.getTileLabel(j, i).equals("F")) win_count++;
      }
    }
    if(win_count == numMine){
      gui.setWinColor(); gui.win();
    }
  }
}
