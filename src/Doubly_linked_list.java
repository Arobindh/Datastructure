
public class Doubly_linked_list {

	Node head; // head of list 
	  
    /* Node class*/
    class Node { 
        int data; 
        Node prev; 
        Node next; 
        Node(int d) { data = d; } //constructor
    } 
  
    // Node added to the front of the list 
    public void push(int new_data) 
    { 
        Node newNode = new Node(new_data); 
        newNode.next = head; 
        newNode.prev = null; 
        if (head != null) 
            head.prev = newNode;
        head = newNode; 
    } 
  
    /* new node added next to the given node */
    public void PushAfter(Node prev_Node, int new_data) 
    { 
          if (prev_Node == null) { 
            System.out.println("The given node cannot be NULL, Please enter a valid node."); 
            return; 
        } 
  
        Node new_node = new Node(new_data); 
          new_node.next = prev_Node.next; 
          prev_Node.next = new_node; 
          new_node.prev = prev_Node; 
          if (new_node.next != null) 
            new_node.next.prev = new_node; 
    } 
      void append(int new_data) 
    { 
        Node new_node = new Node(new_data); 
  
        Node last = head; /* used in step 5*/
        new_node.next = null; 

        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
  
        while (last.next != null) 
            last = last.next; 
  
        last.next = new_node; 
          new_node.prev = last; 
    } 
  
    public void printlist(Node node) 
    { 
        Node last = null; 
        System.out.println("Printing forward"); 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("Printing in reverse"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.prev; 
        } 
    } 
}
