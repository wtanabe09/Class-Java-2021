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

  private MyNode getMinimumNode(MyNode localNode) {
    if(localNode == null) {
      return null;
    }
    MyNode currentNode = localNode;
    while(true) {
      if(currentNode.getLeft() == null) {
        return currentNode;
      }
      currentNode = currentNode.getLeft();
    }
  }

  public boolean remove(MyData aData) {
    if(this.root == null) {
      return false;
    }
    MyNode parentNode = this.root;
    MyNode currentNode = this.root;
    boolean inLeftSubTree = false;
    while(currentNode.getData().compareTo(aData) != 0) {
      parentNode = currentNode;
      if(currentNode.getData().compareTo(aData) > 0) {
        currentNode = currentNode.getLeft();
        inLeftSubTree = true;
      } else {
        currentNode = currentNode.getRight();
        inLeftSubTree = false;
      }
      if(null == currentNode) {
        return false;
      }
    }
    //削除するノードが子を持たない
    if(currentNode.getLeft() == null && currentNode.getRight() == null) {
      if(currentNode == this.root) {
        this.root = null;
      } else if(inLeftSubTree) {
        parentNode.setLeft(null);
      } else {
        parentNode.setRight(null);
      } 
    }
    // 削除するノードが左の子を一つ持つ場合
    else if(currentNode.getRight() == null) {
      if(currentNode == this.root) {
        this.root = currentNode.getLeft();
      } else if(inLeftSubTree) {
        parentNode.setLeft(currentNode.getLeft());
      } else {
        parentNode.setRight(currentNode.getLeft());
      }
    }
    // 削除するノードが右の子を一つ持つ場合
    else if(currentNode.getLeft() == null) {
      if(currentNode == this.root) {
        this.root = currentNode.getRight();
      } else if(inLeftSubTree) {
        parentNode.setLeft(currentNode.getRight());
      } else {
        parentNode.setRight(currentNode.getRight());
      }
    }
    // 削除するノードが子を２つ持つ場合
    else {
      MyNode minimumNode = this.getMinimumNode(currentNode.getRight());
      this.remove(minimumNode.getData());
      minimumNode.setLeft(currentNode.getLeft());
      minimumNode.setRight(currentNode.getRight());
      if(currentNode == this.root) {
        this.root = minimumNode;
      } else if(inLeftSubTree) {
        parentNode.setLeft(minimumNode);
      } else {
        parentNode.setRight(minimumNode);
      }
    }
    // 削除するノードの子ノードをnullに
    currentNode.setLeft(null);
    currentNode.setRight(null);
    return true;
  }

  public MyNode search(MyData aData) {
    if(this.root == null) {
      return null;
    }
    MyNode currentNode = this.root;
    while(true) {
      if(currentNode.getData().compareTo(aData) == 0) {
        return currentNode;
      }
      if(currentNode.getData().compareTo(aData) > 0){
        if(currentNode.getLeft() == null) {
          return null;
        }
        currentNode = currentNode.getLeft();
      } else {
        if(currentNode.getRight() == null) {
          return null;
        }
        currentNode = currentNode.getRight();
      }
    }
  }

  public void printTreeInOrder() {
    System.out.println(this.traverseInOrder(this.root));
  }
  // 間順操作
  private String traverseInOrder(MyNode localNode) {
    if(localNode == null) {
      return "";
    }
    StringBuffer tr = new StringBuffer();
    tr.append(this.traverseInOrder(localNode.getLeft()));
    tr.append(localNode + "\n");
    tr.append(this.traverseInOrder(localNode.getRight()));
    return tr.toString();
  }

  //Lesson22_1
  public void printTreePreOrder() {
    System.out.println(this.traversePreOrder(this.root));
  }
  private String traversePreOrder(MyNode localNode) {
    if(localNode == null) {
      return "";
    }
    StringBuffer tr = new StringBuffer();
    tr.append(localNode + "\n");
    tr.append(this.traversePreOrder(localNode.getLeft()));
    tr.append(this.traversePreOrder(localNode.getRight()));
    return tr.toString();
  }

  public void printTreePostOrder() {
    System.out.println(this.traversePostOrder(this.root));
  }
  private String traversePostOrder(MyNode localNode) {
    if(localNode == null) {
      return "";
    }
    StringBuffer tr = new StringBuffer();
    tr.append(this.traversePostOrder(localNode.getLeft()));
    tr.append(this.traversePostOrder(localNode.getRight()));
    tr.append(localNode + "\n");
    return tr.toString();
  }

  public void printTreeDesc() {
    System.out.println(this.traverseDesc(this.root));
  }
  private String traverseDesc(MyNode localNode) {
    if(localNode == null) {
      return "";
    }
    StringBuffer tr = new StringBuffer();
    tr.append(this.traverseDesc(localNode.getRight()));
    tr.append(localNode + "\n");
    tr.append(this.traverseDesc(localNode.getLeft()));
    return tr.toString();
  }

  //Lesson22_2
  public void removeLevel(int level) {
    this.removeSubLevel(this.root, level);
  }
  private void removeSubLevel(MyNode myNode, int level) {
    if(myNode == null) {
      return ;
    }
    if(level != 0) {
      this.removeSubLevel(myNode.getLeft() ,level-1);
      this.removeSubLevel(myNode.getRight() ,level-1);
    } else {
      remove(myNode.getData());
    }
  }

  //Lesson22_3
  public BinarySearchTree cutTree(MyData aData) {
    BinarySearchTree tree = new BinarySearchTree();
    copy(tree, search(aData));
    search(aData).setLeft(null);
    search(aData).setRight(null);
    remove(aData);
    return tree;
  }
  private void copy(BinarySearchTree tree, MyNode myNode) {
    // tree.root = myNode;
    if(myNode == null) {
      return ;
    }
    tree.insert(myNode.getData());
    copy(tree, myNode.getLeft());
    copy(tree, myNode.getRight());
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