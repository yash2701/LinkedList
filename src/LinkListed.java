
public class LinkListed {
	
	Node head; // First Node of Link list with Head

	public void insert(int data) {     //  Getting values from MainLinkList 
		Node node = new Node();       // create object of Node class
		node.data = data;            
		node.next = null;
		
		if (head == null) {           // first node is always head of linked list
			head = node;              
		}
		else {
			Node n = head;            // after every head we can insert node to list
			while(n.next != null) {
				n = n.next; 
			}
			n.next = node;
		}
	}

	public void show() {
		// TODO Auto-generated method stub
		Node node = head;
		
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;  
		}
		System.out.println(node.data);
	}
	
	public void delete() {
		
			Node temp = head;
			head = temp.next;
		
	}
	
	
}
