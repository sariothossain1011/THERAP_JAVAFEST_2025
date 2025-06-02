package roadmap_topics_practices.data_structure.linked_list_manipulation;


public class ReverseRecursiveLinkedList {
    Node head;
    private int size;
    ReverseRecursiveLinkedList(){
        this.size = 0;
    }

    public class  Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirstNode(int data){
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
        size ++;
    }
    public int getSize(){
        return size;
    }

    public Node reverseRecursiveLinkedList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursiveLinkedList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void printReverseRecursiveLinkedList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+"-->");
            currNode =currNode.next;
            
        }
         System.out.println(" null");
    }

    public static void main(String[] args) {

        ReverseRecursiveLinkedList rrll = new ReverseRecursiveLinkedList();
        rrll.addFirstNode(10);
        rrll.addFirstNode(20);
        rrll.addFirstNode(30);
        rrll.addFirstNode(40);

        System.out.println(rrll.getSize());
        rrll.printReverseRecursiveLinkedList();

        rrll.head = rrll.reverseRecursiveLinkedList(rrll.head);
        rrll.printReverseRecursiveLinkedList();

        
    }
}