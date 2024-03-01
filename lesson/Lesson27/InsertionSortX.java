public class InsertionSortX {
  private int[] sort_array;
  private int assginCount;
  private int compareCount;
  protected long timeStart;
  protected long timeStop;


  private InsertionSortX() {}
  public InsertionSortX(int[] sort_array) {
    this.sort_array = sort_array;
  }
  public void insertionSortX() {
    // this.startTimer();
    int in, out, temp;
    for(out = 1; out < this.sort_array.length; out++) {
      temp = this.sort_array[out];
      assginCount++;
      in = out;
      while(in > 0 && compareValue(this.sort_array[in - 1], temp) == 1) {
        this.sort_array[in] = this.sort_array[in - 1];
        assginCount++;
        in--;
      }
      this.sort_array[in] = temp;
      assginCount++;
      // SortTest.display(sort_array);
    }
    // this.stopTimer();
  }

  public void display() {
    for(int i = 0; i < this.sort_array.length; i++) {
      System.out.print(this.sort_array[i] + " ");
    }
    System.out.println();
  }

  // Lesson26_2
  public int getAssignCount() {
    return this.assginCount;
  }
  public int getCompareCount() {
    return this.compareCount;
  }
  private int compareValue(int n1, int n2) {
    this.compareCount++;
    if(n1 > n2) {
      return 1;
    } else if(n1 < n2) {
      return -1;
    } else {
      return 0;
    }
  }
  public boolean checkSort() {
    for(int i = 0; i < this.sort_array.length - 1; i++) {
      if(this.sort_array[i] > this.sort_array[i + 1]) {
        return false;
      }
    }
    return true;
  }


  //Lesson26_3
  public void startTimer() {
    timeStart = System.nanoTime();
  }

  public void stopTimer() {
    timeStop = System.nanoTime();
  }

  public long getSortTime() {
    long c_time = timeStop - timeStart;
    return c_time;
  }

}