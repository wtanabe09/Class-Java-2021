public class SelectionSort {
  private int[] sort_array;
  protected long timeStart;
  protected long timeStop;

  protected int assginCount = 0;
  protected int compareCount = 0;


  private SelectionSort() {}
  public SelectionSort(int[] sort_array) {
    this.sort_array = sort_array;
  }
  
  public void swap(int x, int y) {
    assginCount += 3;
    int temp = this.sort_array[x];
    this.sort_array[x] = this.sort_array[y];
    this.sort_array[y] = temp;
  }
  public void selectionSort() {
    int out, in, min;
    for(out = 0; out < this.sort_array.length - 1; out++) {
      min = out;
      for(in = out + 1; in < this.sort_array.length; in++) {
        // if(this.sort_array[in] < this.sort_array[min])
        if(compareValue(this.sort_array[in], this.sort_array[min]) == -1) {
          min = in;
        }
      }
      this.swap(out, min);
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

  //Lesson25_3
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