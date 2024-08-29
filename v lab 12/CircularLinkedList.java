// Implemention of Circular Linked List

import java.util.*;

class Node {
	int info;
	Node link;

	public Node(int data){
		this.info = data;
		this.link = null;
	}
}

class LinkedList {
	Node first;
	Node last;

	// Add value at front of the list
	public void insertAtFirst(int data){
		Node newNode = new Node(data);
		if(first==null){
			first = newNode;
			last = newNode;
			return;
		}
		newNode.link = first;
		last.link = newNode;
		first = newNode;
	}


	// Add value at end of the list
	public void insertAtLast(int data){
		Node newNode = new Node(data);
		if(first==null){
			first = newNode;
			last = newNode;
			return;
		}
		newNode.link = first;
		last.link = newNode;
		last = newNode;
	}


	// Add value in ordered list
	public void insertInOrdered(int data){
		Node newNode = new Node(data);
		if(first==null){
			newNode.link = first;
			first = newNode;
			last = newNode;
			return;
		}
		if(newNode.info<=first.info){
			newNode.link = first;
			last.link = newNode;
			first = newNode;
			return;
		}
		Node currentNode = first;
		while(currentNode!=last && currentNode.link.info <= newNode.info){
			currentNode = currentNode.link;
		}
		newNode.link = currentNode.link;
		currentNode.link = newNode;
		// if(currentNode == last){
		// 	last = newNode;
		// }
	}


	// Remove node from the list
	public void deleteNode(int value){
		if(first==null){
			System.out.println("List is Empty.");
			return;
		}
		Node currentNode = first;
		Node prevNode = null;
		if(first==last){  // only one node
			first = null;
			last = null;
			return;
		}
		if(currentNode.info==value){ // first node j hoy 
			first = currentNode.link;
			last.link = first;
			return;
		}
		while(currentNode.info!=value && currentNode!=last){
			prevNode = currentNode;
			currentNode = currentNode.link;
		}
		if(currentNode.info!=value){
			System.out.println("Node not found.");
			return;
		}
		prevNode.link = currentNode.link;
		if(last.info==value){
			last = prevNode;
		}
	}


	// Count nodes of the list
	public int numberOfNodes(){
		int count=0;
		if(first==null){
			count=0;
			return count;
		}
		Node currentNode = first;
		while(currentNode != last){
			currentNode = currentNode.link;
			count++;
		}
		return (count+1);
	}


	// Reverse the list
	public void reverseList(){
		if(first==last || first.link==null){
			return;
		}
		Node prevNode = null;
		Node currentNode = first;
		while(true){
			Node nextNode = currentNode.link;
			currentNode.link = prevNode;

			prevNode = currentNode;
			currentNode = nextNode;

			if(currentNode==first){
				break;
			}
		}
		first.link = last;
		first = prevNode;
	}


	// Copy the list
	public void copyList(){
		if(first==null){
			System.out.println("List is Empty");
			return;
		}
		Node bigen = first;
		Node cur1 = first.link;
		Node cur2 = bigen;
		while(true){
			cur2.link = cur1;
			cur1 = cur1.link;
			cur2=cur2.link;

			if(cur1 == last){
				break;
			}
		}
	}


	// Split the list
	public void splitList(){
		if(first==null || first.link==first){
			return;  // No split needed for an empty list or a single node 
		}
		Node slow = first;
		Node fast = first;
		while(fast.link!=first && fast.link.link!=first){
			slow = slow.link;
			fast = fast.link.link;
		}
		if(fast.link.link==first){
			fast = fast.link;
		}
		Node first1 = first;
		Node first2 = slow;
		slow.link = first1;  // End the first half
		fast.link = first2;	 // End the second half
	}


	public void display(){
		System.out.println();
		if(first==null){
			System.out.println("List is Empty");
			return;
		}
		Node currentNode = first;
		System.out.print("Circular LinkedList : ");
		while(true){
			if(currentNode.link==first){
				System.out.print(currentNode.info);
			}
			else{
				System.out.print(currentNode.info + " -> ");
			}
			currentNode = currentNode.link;
			if(currentNode==first){
				break;
			}
		}
		System.out.println();
	}
}

public class CircularLinkedList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		LinkedList list = new LinkedList();

		while(true){
			System.out.println("\nMenu : ");
			System.out.println("Enter 1 for insert at front of the list");
			System.out.println("Enter 2 for insert at end of the list");
			System.out.println("Enter 3 for insert in orederd list");
			System.out.println("Enter 4 for delete Node of the list");
			System.out.println("Enter 5 for size(Node) of the list");
			System.out.println("Enter 6 for reverse for the list");
			System.out.println("Enter 7 for copy for the list");
			System.out.println("Enter 8 for Split the list");
			System.out.println("Enter 9 for display of the list");
			System.out.println("Enter 10 for exit from the list");

			System.out.println();
			int choice = sc.nextInt();

			switch(choice){
				case 1 : System.out.print("Enter value to insert at front : ");
						 int value = sc.nextInt();
						 list.insertAtFirst(value);
						 break; 

				case 2 : System.out.print("Enter value to insert at last : ");
						 value = sc.nextInt();
						 list.insertAtLast(value);
						 break;

				case 3 : System.out.print("Enter value in orederd link list : ");
						 value = sc.nextInt();
						 list.insertInOrdered(value);
						 break;

				case 4 : System.out.print("Enter value to delete from the list : ");
						 value = sc.nextInt();
						 list.deleteNode(value);
						 break;

				case 5 : System.out.println("Number of nodes in Singly Linked List : "+list.numberOfNodes());
						 break;

				case 6 : list.reverseList();
			    		 list.display(); 
			   			 break;

			   	case 7 : list.copyList();
						 list.display();
						 break;

				case 8 : list.splitList();
						 list.display();
						 list.display();
						 break;

				case 9 : list.display();
						 break;

				case 10 : System.exit(0);

				default : System.out.println("Invalid Choice...");
			}
		}
	}
}