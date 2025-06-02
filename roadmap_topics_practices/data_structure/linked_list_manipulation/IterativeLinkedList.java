package roadmap_topics_practices.data_structure.linked_list_manipulation;

public class IterativeLinkedList {
    Node head;
    private int size;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add
    public void addFirstNode(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head =prevNode;

    }

    // get size
    public int getSize() {
        return size;
    }

    // print
    public void printIterativeLinkedList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        IterativeLinkedList ill = new IterativeLinkedList();
        ill.addFirstNode(10);
        ill.addFirstNode(20);
        ill.addFirstNode(30);
        ill.addFirstNode(40);
        System.out.println(ill.getSize());
        ill.printIterativeLinkedList();
        ill.reverseIterate();
        ill.printIterativeLinkedList();

    }
}
