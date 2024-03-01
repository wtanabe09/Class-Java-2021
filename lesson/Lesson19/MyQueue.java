public class MyQueue {
  private Object[] queueArray;
  private int head;
  private int tail;
  private int maxSize;
  private int num;
  private MyQueue() {
  }
  public MyQueue(int size) {
    this.queueArray = new Object[size];
    this.head = 0;
    this.tail = 0;
    this.num = 0;
    this.maxSize = size;
  }
  public int enqueue(Object obj) {
    if(this.num < this.maxSize) {
      this.queueArray[this.tail] = obj;
      int oldtail = this.tail;
      this.tail = (this.tail + 1) % this.maxSize;
      this.num++;
      return oldtail;
    } else {
      return -1;
    }
  }
  public Object dequeue() {
    if(this.num > 0) {
      Object obj = this.queueArray[head];
      this.head = (this.head + 1) % this.maxSize;
      this.num--;
      return obj;
    } else {
      return null;
    }
  }
  public boolean isEmpty() {
    return (this.num == 0);
  }
  public boolean isFull() {
    return (this.num == this.maxSize);
  }

  //Lesson19_3
  public void clear() {
    while(!this.isEmpty()) {
      this.dequeue();
    }
  }
  public Object peek() {
    if(this.num > 0) {
      Object obj = this.queueArray[head];
      return obj;
    } else {
      return null;
    }
  }
  public int forceEnqueue(Object obj) {
    if(isFull()) {
      this.dequeue();
      return this.enqueue(obj);
    } else {
      return this.enqueue(obj);
    }
  }

  //Lesson19_4
  public void rotate(int n) {
    if(this.num <= 0) {
      return;
    }
    for(int i = 0; i < n; i++) {
      this.enqueue(this.dequeue());
    }
  }

  public void printAll() {
    System.out.println("Contents of Queue");
    if(!this.isEmpty()) {
      int position = this.head;
      for(int i = 0; i < this.num; i++) {
        position = (this.head + i) % this.maxSize;
        System.out.println(this.queueArray[position]);
      }
    }
  }
}