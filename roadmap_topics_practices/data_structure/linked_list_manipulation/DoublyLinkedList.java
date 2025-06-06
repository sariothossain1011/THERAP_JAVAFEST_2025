package roadmap_topics_practices.data_structure.linked_list_manipulation;

public class DoublyLinkedList {

    static class node {
        int data;
        node next;

        node(int value) {
            data = value;
            next = null;
        }
    }

    static node head;

    static void printList() {
        node p = head;
        System.out.println("\n[");
        while (p != null) {
            System.out.println(" " + p.data + " ");
            p = p.next;
        }
        System.out.println("]");
    }

    static void insertatbegin(int data) {
        node lk = new node(data);
        lk.next = head;
        head = lk;
    }

    static void insertatend(int data) {

        node lk = new node(data);
        if (head == null) {
            head = lk; // If list is empty, new node becomes head
            return;
        }
        node linkedlist = head;
        while (linkedlist.next != null) {
            linkedlist = linkedlist.next;
            linkedlist.next = lk;
        }
    }

    public static void main(String[] args) {

        // follow LIFO - LAST IN FIRST OUT
        insertatbegin(12);
        insertatbegin(22);
        insertatbegin(30);
        insertatbegin(44);
        insertatbegin(50);
        // insertatend(60);
        // insertatend(20);
        // insertatend(30);
        // insertatend(50);
        // insertatend(70);
        System.out.print("Linked list");

        printList();

    }
}