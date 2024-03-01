public class DoublyLinkedList {
  private DoublyElement firstElement;
  private DoublyElement lastElement;
  private int length;

  public DoublyLinkedList() {
    this.firstElement = new DoublyElement(null);
    this.lastElement = new DoublyElement(null);
    this.firstElement.setNextElement(this.lastElement);
    this.lastElement.setPreviousElement(this.firstElement);
  }
  private DoublyElement getElement(int index) {
    DoublyElement currentElement = this.firstElement;
    for(int count = 0; count < index; count++) {
      currentElement = currentElement.getNextElement();
      if(currentElement == this.lastElement) {
        return null;
      }
    }
    return currentElement;
  }
  public Object get(int index) {
    DoublyElement element = this.getElement(index);
    if(null == element) {
      System.out.println("Not exist: " + index);
      return null;
    }
    return element.getData();
  }
  public boolean insert(int index, Object obj) {
    if(index < 1) {
      System.out.println("Cannnot insert: " + index);
      return false;
    }
    DoublyElement previous = this.getElement(index - 1);
    if(previous == null) {
      System.out.println("Cannnot insert: " + index);
      return false;
    }
    DoublyElement element = new DoublyElement(obj);
    element.setNextElement(previous.getNextElement());
    previous.getNextElement().setPreviousElement(element);
    previous.setNextElement(element);
    element.setPreviousElement(previous);
    this.length++;
    return true;
  }
  public boolean remove(int index) {
    if(index < 1) {
      System.out.println("Cannnot remove:" + index);
      return false;
    }
    DoublyElement removeElement = this.getElement(index);
    if(removeElement == null) {
      System.out.println("Cannnot remove:" + index);
      return false;
    }
    DoublyElement previous = this.getElement(index - 1);
    previous.setNextElement(removeElement.getNextElement());
    removeElement.getNextElement().setPreviousElement(previous);
    removeElement.setNextElement(null);
    removeElement.setPreviousElement(null);
    this.length--;
    return true;
  }

  //Lesson18_1
  public void printAllReverse() {
    DoublyElement currentElement = this.lastElement.getPreviousElement();
    while(currentElement != this.firstElement) {
      System.out.println(currentElement);
      currentElement = currentElement.getPreviousElement();
      if(currentElement != this.firstElement) {
        System.out.println("<->");
      }
    }
    System.out.println();
  }

  //Lesson18_2
  public int getLength() {
    return this.length;
  }
  public int search(Object obj) {
    DoublyElement element = this.firstElement.getNextElement();
    int count = 0;
    while(element != this.lastElement) {
      count++;
      if(element.getData().equals(obj)) {
        return count;
      }
      element = element.getNextElement();
    }
    return -1;
  }

  //Lesson18_3
  public void insertFirst(Object obj) {
    DoublyElement insertElement = new DoublyElement(obj);
    DoublyElement nextElement = this.firstElement.getNextElement();
    this.firstElement.setNextElement(insertElement);
    nextElement.setPreviousElement(insertElement);
    insertElement.setPreviousElement(this.firstElement);
    insertElement.setNextElement(nextElement);
  }
  public void insertLast(Object obj) {
    DoublyElement insertElement = new DoublyElement(obj);
    DoublyElement previousElement = this.lastElement.getPreviousElement();
    previousElement.setNextElement(insertElement);
    this.lastElement.setPreviousElement(insertElement);
    insertElement.setNextElement(this.lastElement);
    insertElement.setPreviousElement(previousElement);
  }

  //Lesson18_4
  public boolean removeFromFirst(Object obj) {
    int index = search(obj);
    if(index == -1) {
      return false;
    } else {
      remove(index);
      return true;
    }
  }
  public boolean removeFromLast(Object obj) {
    DoublyElement element = this.lastElement.getPreviousElement();
    int count = length + 1;
    while(element != this.firstElement) {
      count--;
      if(element.getData().equals(obj)) {
        remove(count);
        return true;
      }
      element = element.getPreviousElement();
    }
    return false; 
  }


  public DoublyLinkedList split(int index) {
    DoublyElement element = this.getElement(index);
    DoublyLinkedList new_list = new DoublyLinkedList();
    if(index < this.length) {
      new_list.firstElement.setNextElement(element.getNextElement());
      new_list.lastElement.setPreviousElement(this.lastElement.getPreviousElement());
      new_list.firstElement.getNextElement().setPreviousElement(new_list.firstElement);
      new_list.lastElement.getPreviousElement().setNextElement(new_list.lastElement);
      element.setNextElement(lastElement);
      lastElement.setPreviousElement(element);
      return new_list;
    } else {
      return new_list;
    }
  }
  
  public void printAll() {
    DoublyElement currentElement = this.firstElement.getNextElement();
    while(currentElement != this.lastElement) {
      System.out.println(currentElement);
      currentElement = currentElement.getNextElement();
      if(currentElement != this.lastElement) {
        System.out.println("<->");
      }
    }
    System.out.println();
  }
}