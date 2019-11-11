

public class BinarySearchTree {

  public static class Tnode {
    int value;
    Tnode left;
    Tnode right;

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }

    public Tnode getLeft() {
      return left;
    }

    public void setLeft(Tnode left) {
      this.left = left;
    }

    public Tnode getRight() {
      return right;
    }

    public void setRight(Tnode right) {
      this.right = right;
    }

    public Tnode(int value) {
      super();
      this.value = value;
      this.left = null;
      this.right = null;
    }

  }

  public static class BST {
    Tnode root;

    public Tnode getRoot() {
      return root;
    }

    public void setRoot(Tnode root) {
      this.root = root;
    }

    public Tnode insert(Tnode newNode, Tnode root) {
      if (root == null) {
        root = newNode;
        return root;
      }
      if (newNode.value < root.value)
        root.left = insert(newNode, root.left);
      else
        root.right = insert(newNode, root.right);


      return root;
    }

  }

  public static void main(String[] args) {
    BST bst=new BST();
    Tnode root = new Tnode(8);
    bst.insert(root, null);
    bst.insert(new Tnode(3), root);
    bst.insert(new Tnode(10), root);
    bst.insert(new Tnode(1), root);
    bst.insert(new Tnode(6), root);
    bst.insert(new Tnode(4), root);
    bst.insert(new Tnode(7), root);
    bst.insert(new Tnode(10), root);
    bst.insert(new Tnode(14), root);
    bst.insert(new Tnode(13), root);

  }
}
