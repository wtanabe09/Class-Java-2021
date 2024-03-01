public class InsertionSort {
    private int[] sort_array;
    //Lesson25_3
    protected long timeStart;
    protected long timeStop;

    //Lesson25_4
    protected int assginCount = 0;
    protected int compareCount = 0;

    private InsertionSort() {}
    public InsertionSort(int[] array) {
        this.sort_array = array;
    }
    private void swap(int x, int y) {
        assginCount += 3;
        int temp = this.sort_array[x];
        this.sort_array[x] = this.sort_array[y];
        this.sort_array[y] = temp;
    }

    // Lesson25_1
    public void insertionSort() {
        for(int i = 0; i < this.sort_array.length - 1; i++) {
            for(int j = i + 1; j > 0 ; j--) {
                // if(this.sort_array[j] < this.sort_array[j - 1])
                if(compareValue(this.sort_array[j], this.sort_array[j - 1]) == -1) {
                    this.swap(j, j - 1);
                    // SortTest.display(this.sort_array);
                } else {
                    break;
                }
            }
        }
    }

    // Lesson25_2
    public boolean checkSort() {
        for(int i = 0; i < this.sort_array.length-1; i++) {
            if(this.sort_array[i] > this.sort_array[i+1]) {
                return false;
            }
        }
        return true;
    }

    // Lesson25_3
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

    // Lesson25_4
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