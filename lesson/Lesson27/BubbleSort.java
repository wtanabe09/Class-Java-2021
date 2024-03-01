public class BubbleSort {
  private int[] sort_array;
  protected long timeStart;
  protected long timeStop;

  protected int assginCount = 0;
  protected int compareCount = 0;

  private BubbleSort() {}
  public BubbleSort(int[] sort_array) {
    this.sort_array = sort_array;
  }

  public void swap(int x, int y) {
    assginCount += 3;
    int temp = this.sort_array[x];
    this.sort_array[x] = this.sort_array[y];
    this.sort_array[y] = temp;
  }
  public void bubbleSort() {
    for(int i = this.sort_array.length - 1; i > 0; i--) {
      for(int j = 0; j < i; j++) {
        // if(this.sort_array[j] > this.sort_array[j + 1])
        if(compareValue(this.sort_array[j], this.sort_array[j + 1]) == 1) {
          this.swap(j, j+1);
        }
      }
    }
  }

  public boolean checkSort() {
    for(int i = 0; i < this.sort_array.length-1; i++) {
      if(this.sort_array[i] > this.sort_array[i+1]) {
          return false;
      }
    }
    return true;
  }

  public void startTimer() {
      timeStart = System.nanoTime();
  }

  public void stopTimer() {
      timeStop = System.nanoTime();
  }

  public long getSortTime() {
    long timeSort;
    timeSort = timeStop - timeStart;
    return timeSort;
  }

  public int getAssignCount() {
      return assginCount;
  }

  public int compareValue(int n1, int n2) {
      compareCount++;
      if(n1 > n2) {
          return 1;
      } else if(n1 < n2) {
          return -1;
      } else {
          return 0;
      }
  }

  public int getCompareCount() {
      return compareCount;
  }

}