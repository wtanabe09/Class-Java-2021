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
    return true;
  }
  public boolean remove(int index) {
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