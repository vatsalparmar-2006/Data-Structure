// Implementation Of Singly Linked List

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
	Node first1;

	public void insertAtFirst(int data){
		Node newNode = new Node(data);
		if(first==null){
			first = newNode;
			return;
		}
		newNode.link = first;
		first = newNode;
	}


	public void insertAtLast(int data){
		Node newNode = new Node(data);
		if(first==null){
			first=newNode;
			return;
		}
		Node currentNode = first;
		while(currentNode.link != null){  //currentNode ne last node sudhi lai java loop.
			currentNode = currentNode.link;
		}
		currentNode.link = newNode;
	}


	public void insertInOrdered(int data){
		Node newNode = new Node(data);
		if(first == null || first.info >= newNode.info){
			newNode.link = first;
			first = newNode;
			return;
		}
		Node currentNode=first;
		while(currentNode.link!=null && currentNode.link.info <= newNode.info){
			currentNode = currentNode.link;
		}
		newNode.link = currentNode.link;
		currentNode.link = newNode;
	}


	public void deleteNode(int value){
		if(first == null){
			System.out.println("List is Empty.");
			return;
		}
		
		Node currentNode=first;
		Node prevNode=null;
		if(currentNode.info == value){
			first = currentNode.link;
			return;
		}
		while(currentNode != null && currentNode.info != value){
			prevNode = currentNode;
			currentNode = currentNode.link;
		}
		
		if(currentNode==null){
			System.out.println("Node is not Found");
		}
		prevNode.link = currentNode.link; //prevNode na link ma currNode na pchina nu address api devanu e currNode.link kevay.
		
	}


	public int numberOfNodes(){
		int count=0;
		if(first==null){
			count=0;
			return count;
		}
		Node currentNode = first;
		while(currentNode != null){
			currentNode = currentNode.link;
			count++;
		}
		return count;
	}


	public void reverseList(){
		if(first==null || first.link==null){
			return; // 1 j node hoy to e j reverce thay jay so first.next e bijo node null check kari otherwise error.
		}
		Node prevNode = first;
		Node currentNode = first.link;
		while(currentNode != null){
			Node nextNode = currentNode.link;

			currentNode.link = prevNode; //currNode ni link ma next nu address hase e kadhine prev nu api devanu.
			
			prevNode = currentNode;
			currentNode = nextNode;
		}
		first.link = null;
		first = prevNode;
	}


	public void copyList(){
		if(first==null){
			System.out.println("List is Empty");
			return;
		}
		Node bigen = first;
		Node cur1 = first.link;
		Node cur2 = bigen;
		while(cur1!=null){
			cur2.link = cur1;
			cur1 = cur1.link;
			cur2=cur2.link;
		}
	}


	public void listAreSame(){
		while(first!=null && first1!=null){
			if(first.info != first1.info){
				System.out.println("List are not same.");
			}
			first = first.link;
			first1 = first1.link;
		}
		if(first!=null || first1!=null){ //length same mate
			System.out.println("List are not same.");
		}
		else{
			System.out.println("List are same.");
		}	
	}


	public void display(){
		System.out.println();
		if(first == null){
			System.out.println("List is Empty.");
		}
		Node currentNode = first;
		System.out.print("Singly Linked List : ");
		while(currentNode != null){
			System.out.print(currentNode.info + " -> ");
			currentNode = currentNode.link;
		}
		System.out.println("NULL");
		System.out.println();
	}
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList();

		while(true){
			System.out.println("\nMenu : ");
			System.out.println("Enter 1 for insert at front of the list");
			System.out.println("Enter 2 for insert at end of the list");
			System.out.println("Enter 3 for insert in orederd list");
			System.out.println("Enter 4 for delete Node of the list");
			System.out.println("Enter 5 for size(Node) of the list");
			System.out.println("Enter 6 for copy for the list");
			System.out.println("Enter 7 for reverse for the list");
			System.out.println("Enter 8 for check list are same or not");
			System.out.println("Enter 9 for display for the list");
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

				case 6 : list.copyList();
						 list.display();
						 break;

			    case 7 : list.reverseList();
			    		 list.display(); 
			   			 break;

			   	case 8 : System.out.print("Enter value to insert at front : ");
			   			 value = sc.nextInt();
						 list2.insertAtLast(value);
						 // break;
			   	// 		 n1.insertAtLast();
			   	// 		 n1.insertInOrdered();
			   			 list.listAreSame();
			   			 break;

			   	case 9 : list.display();
			   			 break;

				case 10 : System.exit(0);
			}
		}
	}
}

