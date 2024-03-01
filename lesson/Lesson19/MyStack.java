public class MyStack {
  private int maxSize;
  private Object[] stackArray;
  private int stackPointer;
  private MyStack() {
  }
  public MyStack(int size) {
    this.maxSize = size;
    this.stackArray = new Object[size];
    this.stackPointer = 0;
  }
  public boolean isEmpty() {
    return (this.stackPointer == 0);
  }
  public boolean isFull() {
    return (this.stackPointer == this.maxSize);
  }
  public Object pop() {
    if (this.isEmpty()) {
      System.err.println("Stack is Empty.");
      return null;
    }
    this.stackPointer--;
    Object popObject = this.stackArray[this.stackPointer];
    this.stackArray[this.stackPointer] = null;
    return popObject;
  }
  public void  push(Object obj) {
    if(this.isFull()) {
      System.err.println("Stack is full.");
      return;
    }
    this.stackArray[this.stackPointer] = obj;
    this.stackPointer++;
  }

  //Lesson19_1
  public void clear() {
    while(!this.isEmpty()) {
      this.pop();
    }
  }
  public Object peek() {
    if (this.isEmpty()) {
      System.err.println("Stack is Empty.");
      return null;
    }
    Object peekObject = this.stackArray[this.stackPointer - 1];
    return peekObject;
  }
  public void printAllReverse() {
    System.out.println("Contents of Stack(Reverse)");
    int count = 1;
    int position = 0;
    while(position < this.maxSize) {
      System.out.println(count + "\t" + this.stackArray[position]);
      count++;
      position++;
    }
    System.out.println();
  }

  //Lesson19_2
  public boolean exchange() {
    if(this.stackPointer >= 2) {
      Object tmp1 = this.pop();
      Object tmp2 = this.pop();
      this.push(tmp1);
      this.push(tmp2);
      return true;
    } else {
      System.out.println("The number of elements is less than 2.");
      return false;
    }
  }

  public void printAll() {
    System.out.println("Contents of Stack");
    int count = 1;
    int position = this.stackPointer - 1;
    while(position >= 0) {
      System.out.println(count + "\t" + this.stackArray[position]);
      count++;
      position--;
    }
    System.out.println();
  }
}