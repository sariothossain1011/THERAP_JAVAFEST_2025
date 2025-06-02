
package roadmap_topics_practices.data_structure.linked_list_manipulation;

public class LinkedList {
   static class node {// node have two part 1. data and 2. node address
      int data; // type of linked list data
      node next;// type of next node address

      node(int value) {
         data = value;
         next = null;
      }
   }

   static node head;

   // display the list
   static void printList() {
      node p = head;
      System.out.print("\n[");

      // start from the beginning
      while (p != null) {
         System.out.print(" " + p.data + " ");
         p = p.next;
      }
      System.out.print("]");
   }

   // insertion at the beginning
   static void insertatbegin(int data) {

      // create a link
      node lk = new node(data);
      ;
      // point it to old first node
      lk.next = head;
      // point first to new first node
      head = lk;
   }



   public static void main(String args[]) {
        // follow LIFO - LAST IN FIRST OUT
        insertatbegin(12);
        insertatbegin(22);
        insertatbegin(30);
        insertatbegin(44);
        insertatbegin(50);
      System.out.print("Linked List: ");

      // print list
      printList();
   }
}