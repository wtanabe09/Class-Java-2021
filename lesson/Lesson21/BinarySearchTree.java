public class BinarySearchTree {
  private MyNode root;
  public BinarySearchTree() {
    this.root = null;
  }
  public void insert(MyData aData) {
    MyNode newNode = new MyNode(aData);
    if(this.root == null) {
      this.root = newNode;
      return;
    }
    MyNode currentNode = this.root;
    while(true) {
      if(currentNode.getData().compareTo(aData) > 0) {
        if(currentNode.getLeft() == null) {
          currentNode.setLeft(newNode);
          return;
        }
        currentNode = currentNode.getLeft();
      } else {
        if(currentNode.getRight() == null) {
          currentNode.setRight(newNode);
          return;
        }
        currentNode = currentNode.getRight();
      }
    }
  }
  public MyData getMaximumData() {
    MyNode currentNode = this.root;
    if(currentNode == null) {
      return null;
    }
    while(true) {
      if(currentNode.getRight() == null) {
        return currentNode.getData();
      }
      currentNode = currentNode.getRight();
    }
  }
  public MyData getMinimumData() {
    MyNode currentNode = this.root;
    if(currentNode == null) {
      return null;
    }
    while(true) {
      if(currentNode.getLeft() == null) {
        return currentNode.getData();
      }
      currentNode = currentNode.getLeft();
    }
  }
  //Lesson21_2
  public int getNumOfNodes() {
    return countNodes(this.root);
  }
  public int countNodes(MyNode currentNode) {
    if(currentNode == null) {
      return 0;
    }
    int c_left = countNodes(currentNode.getLeft());
    int c_right = countNodes(currentNode.getRight());
    return c_left + c_right + 1;
  }
  //Lesson21_3
  public int getHeight() {
    return getNodeHeight(this.root);
  }
  public int getNodeHeight(MyNode currentNode) {
    if(currentNode == null) {
      return 0;
    }
    int h_left = getNodeHeight(currentNode.getLeft());
    int h_right = getNodeHeight(currentNode.getRight());
    if(h_left >= h_right) {
      return h_left + 1;
    } else {
      return h_right + 1;
    }
  }
  //Lesson21_4
  public void showTree() {
    System.out.println(showSubTree(this.root, 0));
  }
  public String showSubTree(MyNode localNode, int counter) {
    if(localNode == null) {
      return "";
    }
    StringBuffer stb = new StringBuffer();
    stb.append(showSubTree(localNode.getRight(), counter+1));
    align(stb, counter);
    stb.append(localNode.getData() + "\n");
    stb.append(showSubTree(localNode.getLeft(), counter+1));
    return stb.toString();
  }
  private void align(StringBuffer bf, int counter) {
    for(int i = 0; i < counter; i++) {
      bf.append("   ");
    }
    bf.append(counter + ":");
  }
  public void printRoot() {
    System.out.println(this.root);
    System.out.println(this.root.getLeft());
    System.out.println(this.root.getRight());
  }
}