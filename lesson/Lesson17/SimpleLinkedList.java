public class SimpleLinkedList {
  private Element firstElement;
  private int length;
  public SimpleLinkedList() {
    this.firstElement = new Element(null);
  }

  public Object get(int index) {
    Element element = this.getElement(index);
    if(element == null) {
      System.out.println("Element-" + index + " is not exist.");
      return null;
    }
    return element.getData();
  }

  public boolean insert(int index, Object obj) {
    if(index < 1) {
      System.out.println("Cannot insert: " + index);
      return false;
    }
    Element previous = this.getElement(index - 1);
    if(previous == null) {
      System.out.println("Cannnot insert: " + index);
      return false;
    }
    Element element = new Element(obj);
    element.setNextElement(previous.getNextElement());
    previous.setNextElement(element);
    this.length++;
    return true;
  }

  public boolean remove(int index) {
    this.length--;
    if (index < 1) {
      System.out.println("Cannot remove: " + index);
      return false;
    }
    Element removeElement = this.getElement(index);
    if(removeElement == null) {
      System.out.println("Cannot remove: " + index);
      return false;
    }
    Element previous = this.getElement(index - 1);
    previous.setNextElement(removeElement.getNextElement());
    removeElement.setNextElement(null);
    return true;
  }

  //Lesson17_1
  public int getLength() {
    return this.length;
  }
  public boolean append(Object obj) {
    return this.insert(length + 1, obj);
  }

  //Lesson17_2
  public int search(Object obj) {
    Element element = this.firstElement.getNextElement();
    // Element previous = element.getNextElement();
    for(int i = 1; i <= length; i++) {
      if(element.getData().equals(obj)) {
        return i;
      }
      element = element.getNextElement();
    }
    System.out.println("Not found " + obj);
    return -1;
  }

  public boolean remove(Object obj) {
    if(search(obj) == -1) {
      System.out.println("Cannot remove : " + obj);
      return false;
    }
    return this.remove(search(obj));
  } // this.remove(s_min);
     

  //Lesson17_3
  public boolean insertList(SimpleLinkedList list, int index) {
    if (index < 1 || this.length - 1 < index) {
      System.out.println("Cannot insert list: index out of bounds");
      return false;
    } else if(list.firstElement.getNextElement() == null) {
      System.out.println("Cannot insert list: insert list is empty");
      return false;
    } else {
      Element e1 = this.getElement(index - 1);
      Element e2 = this.getElement(index);
      Element lfe = list.getElement(1);
      Element lle = list.getElement(list.length);
      lle.setNextElement(e2);
      e1.setNextElement(lfe);
      this.length += list.getLength();
      return true;
    }
  }

  //Lesson17_4
  public boolean cut(int from, int to) {
    if(from < 0 || this.length < to) {
      System.out.println("Cannot cut list: index out of bounds");
      return false;
    } else if(to < from) {
      System.out.println("Cannot cut list: from is bigger than to");
      return false;
    } else {
      Element e1 = this.getElement(from - 1);
      Element e2 = this.getElement(to + 1);
      // e1.setNextElement(null);
      e1.setNextElement(e2);
      int dif = to - from + 1;
      this.length -= dif;
      return true;
    }
  }

  //Lesson17_5
  public boolean stringListSort() {
    SimpleLinkedList sortedList = new SimpleLinkedList();
    while(this.length != 0) {
      Object o_min = this.get(1);
      Object obj;
      for(int i = 1; i <= this.getLength(); i++) {
        obj = this.get(i);
        if(obj.toString().compareTo(o_min.toString()) < 0) {
          o_min = obj;
        }
      }
      this.remove(o_min);
      sortedList.append(o_min);
    }
    this.firstElement.setNextElement(sortedList.getElement(1));
    return true;
  }


  private Element getElement(int index) {
    Element currentElement = this.firstElement;
    for(int count = 0; count < index; count++) {
      if(null == currentElement) {
        return null;
      }
      currentElement = currentElement.getNextElement();
    }
    return currentElement;
  }

  public void printAll() {
    int count = 0;
    Element currentElement = this.firstElement.getNextElement();
    while (currentElement != null) {
      count++;
      System.out.println(count + " : " + currentElement);
      currentElement = currentElement.getNextElement();
    }
    System.out.println();
  }
}