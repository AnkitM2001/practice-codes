public class Linked_list{
    public static void main(String[] args) {  
        LinkedList ll = new LinkedList();  
        ll.addElement(1);  
        ll.addElement(5);  
        ll.addElement(3); 
        ll.addElement(9);
        ll.addElement(7);
        ll.display(ll.head);
        ll.deleteNode(3);
        ll.display(ll.head);
    }  
}  

class Node {  
    int val;  
    Node next;  

    public Node(int val) {  
        this.val = val;  
    }  
}  

class LinkedList {  
    Node head;  
    Node tail;  

    public void addElement(int val) {  
        Node n = new Node(val);  
        if (head == null) {  
            head = n;  
            tail = n;  
        } else {  
            tail.next = n;  
            tail = n;  
        }  
    }  
    
    public void deleteNode(int k) {
    	int count = 1;
    	Node temp = head;
    	while(count<k-1) {
    		temp = temp.next;
    		count++;
    	}
    	temp.next = temp.next.next;
    }

    public void display(Node head) {  
        Node temp = head;  
        while (temp != null) {  
            System.out.print(temp.val + " -> ");  
            temp = temp.next;  
        }  
        System.out.println("null");  
    }  
}