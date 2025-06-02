package roadmap_topics_practices.data_structure.linked_list_manipulation;

public class SinglyLindedListOperation {
    Node head;
    private int size;

    SinglyLindedListOperation() {
        this.size = size;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first node in list
    public void addFirstNode(String data) {
        Node newNode = new Node(data);
        // if (head == null) {
        // head = newNode;
        // return;
        // }
        newNode.next = head;
        head = newNode;
    }

    // add last node in list
    public void addLastNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // delete first node in list
    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last node in list
    public void deleteLastNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    // print single linked list
    public void printSingleLinkList() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //print linked list size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        SinglyLindedListOperation sllo = new SinglyLindedListOperation();

        // add operaiton
        sllo.addFirstNode("a");
        sllo.addFirstNode("is");
        sllo.addLastNode("List");
        sllo.printSingleLinkList();
        sllo.addFirstNode("This");
        sllo.printSingleLinkList();

        // delete operaiton
        sllo.deleteFirstNode();
        sllo.printSingleLinkList();
        sllo.deleteLastNode();
        sllo.printSingleLinkList();
        
        // find size operaiton
        System.out.println(sllo.getSize());

    }
}
