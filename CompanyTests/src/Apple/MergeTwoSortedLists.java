package Apple;

public class MergeTwoSortedLists {

  public static class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static class LinkedListN {
    Node head;

    public LinkedListN() {
      super();
    }

    public Node addtoLast(Node node) {
      if (head == null)
        head = node;
      else {
        Node cur = head;
        while (cur.next != null)
          cur = cur.next;
        cur.next = node;
      }
      return head;
    }

    public void printList() {
      Node cur = head;
      while (cur != null) {
        System.out.print(cur.value + "->");
        cur = cur.next;
      }
    }

  }


  public static void main(String[] args) {
    LinkedListN ll1 = new LinkedListN();
    ll1.addtoLast(new Node(5));
    ll1.addtoLast(new Node(10));
    ll1.addtoLast(new Node(15));
    ll1.printList();
    System.out.println();

    LinkedListN ll2 = new LinkedListN();
    ll2.addtoLast(new Node(2));
    ll2.addtoLast(new Node(3));
    ll2.addtoLast(new Node(20));
    ll2.printList();
    System.out.println();

    LinkedListN ll3 = new LinkedListN();
    ll3.head = merge(ll1.head, ll2.head);
    ll3.printList();

  }


  private static Node merge(Node head1, Node head2) {
    Node dummyNode = new Node(0);
    Node tail = dummyNode;

    while (true) {
      if (head1 == null) {
        tail.next = head2;
        break;
      }
      if (head2 == null) {
        tail.next = head1;
        break;
      }

      if (head1.value < head2.value) {
        tail.next = head1;
        head1 = head1.next;
      } else {
        tail.next = head2;
        head2 = head2.next;

      }
      tail = tail.next;
    }

    return dummyNode.next;

  }

}
