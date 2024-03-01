public class InsertionQuickSort {
  private int[] sort_array;
  private int threshold;
  private int assginCount;
  private int compareCount;

  private InsertionQuickSort() {}

  public InsertionQuickSort(int[] sort_array) {
    this.sort_array = sort_array;
  }

  public void swap(int i, int j) {
    assginCount += 3;
    int temp = this.sort_array[i];
    this.sort_array[i] = this.sort_array[j];
    this.sort_array[j] = temp;
  }

  public void setThreshold(int thresh) {
    this.threshold = thresh;
  }

  public void display() {
    for(int i = 0; i < this.sort_array.length; i++) {
      System.out.print(this.sort_array[i] + " ");
    }
    System.out.println();
  }

  public void insertionQuickSort(int from, int to) {
    if(from >= to) return;
    if((to - from + 1) > this.threshold) {
      int pivot = this.sort_array[(from + to) / 2];
      int left = from;
      int right = to;

      while(left <= right) {
        while(compareValue(this.sort_array[left], pivot) == -1) left++;
        while(compareValue(this.sort_array[right], pivot) == 1) right--;
        if(left <= right) {
          this.swap(left, right);
          left++;
          right--;
        }
      }
      this.insertionQuickSort(from, right);
      this.insertionQuickSort(left, to);
    } else {
      // assginCount += 3;
      int in, temp;
      for(int i = from + 1; i < to + 1; i++) {
        temp = this.sort_array[i];
        assginCount++;
        in = i;
        while(in > from && compareValue(this.sort_array[in - 1], temp) == 1) {
          this.sort_array[in] = this.sort_array[in - 1];
          in--;
          assginCount++;
          // SortTest.display(this.sort_array);
        }
        this.sort_array[in] = temp;
        assginCount++;
      } 
    }
    
  }
  
  public int getAssignCount() {
    return assginCount;
  }

  public int getCompareCount() {
    return compareCount;
  }

  public int compareValue(int n1, int n2) {
    this.compareCount++;
    if(n1 > n2) {
      return 1;
    } else if(n1 < n2) {
      return -1;
    } else {
      return 0;
    }
  }
}