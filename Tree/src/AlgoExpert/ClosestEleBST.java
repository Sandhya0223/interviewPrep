package AlgoExpert;

/* https://www.geeksforgeeks.org/find-closest-element-binary-search-tree/
 *  
 *  Start comparing from the root and find the absolute diff..if key is less than root, go left
 *  if key is more than root, go right
 */


public class ClosestEleBST {

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


  }

  public static void main(String[] args) {
    BST bst = new BST();
   
    Tnode root = new Tnode(9);
    bst.root= root;
    Tnode four = new Tnode(4);
    Tnode three = new Tnode(3);
    Tnode seventeen = new Tnode(17);
    Tnode twenty = new Tnode(20);
    Tnode twentytwo = new Tnode(22);
    Tnode five = new Tnode(5);
    Tnode six = new Tnode(6);
    Tnode seven = new Tnode(7);
    root.left = four;
    root.right = seventeen;
    root.left.left = three;
    root.left.right = six;
    root.left.right.left = five;
    root.left.right.right = seven;
    root.right.right = twentytwo;
    root.right.right.left = twenty;

    findClosest(root, 12);



  }

  static int min_diff = Integer.MAX_VALUE;
  static int min_Node_val = -1;

  private static void findClosest(Tnode root, int i) {

    findClosestUtil(root, i);
    System.out.println(min_Node_val);

  }

  private static void findClosestUtil(Tnode root, int k) {
    if (root == null)
      return;

    if (root.value == k) {
      min_Node_val = k;
      return;
    }

    if (min_diff > Math.abs(root.value - k)) {
      min_diff = Math.abs(root.value - k);
      min_Node_val = root.value;
    }

    if (k < root.value)
      findClosestUtil(root.left, k);
    else
      findClosestUtil(root.right, k);

  }

}
