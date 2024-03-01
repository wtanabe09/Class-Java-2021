public class QuickSort {
  private int[] sort_array;
  private int assginCount;
  private int compareCount;

  private QuickSort() {}
  public QuickSort(int[] sort_array) {
    this.sort_array = sort_array;
  }

  public void swap(int i, int j) {
    assginCount += 3;
    int temp = this.sort_array[i];
    this.sort_array[i] = this.sort_array[j];
    this.sort_array[j] = temp;
  }


  public void quickSort() {
    this.quickSort(0, this.sort_array.length - 1);
  }
  public void quickSort(int from, int to) {
    if(from >= to) return;
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
    this.quickSort(from, right);
    this.quickSort(left, to);
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