
public class Chief 
{
	public static void main(String args[])
	{
		Doubly_linked_list dll = new Doubly_linked_list();
        dll.append(6); 
        dll.push(7); 
        dll.push(1); 
        dll.append(4); 
        dll.PushAfter(dll.head.next, 8); 
        dll.printlist(dll.head); 
	}
}
