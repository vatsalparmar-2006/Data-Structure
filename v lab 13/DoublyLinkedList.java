import java.util.*;

class Node {
	int info;
	Node lptr;
	Node rptr;

	public Node(int data){
		this.info = data;
		this.lptr = null;
		this.rptr = null;
	}

	Node first;
	Node last;

	public void insertAtFirst(int data){
		Node newNode = new Node(data);
		if(first==null){
			first = newNode;
			last = newNode;
			return;
		}

		newNode.rptr = first;
		first.lptr = newNode;
		first = newNode;
	}


	public void insertAtLast(int data){
		Node newNode = new Node(data);
		if(last==null){
			first = newNode;
			last = newNode;
		}
		else{
			last.rptr = newNode;
			newNode.lptr = last;
			last = newNode;
		}
	}


	public void insertAtMiddle(int data,int position){
		Node newNode = new Node(data);
		if(position==1){
			insertAtFirst(data);
		}	 
		else{
			Node currentNode = first;
			int currentPosition = 1;
			while(currentNode!=null && currentPosition<position){
				currentNode = currentNode.rptr;
				currentPosition++;
			}
			if(currentNode==null){
				insertAtLast(data);
			}
			else{
				newNode.rptr = currentNode;
				newNode.lptr = currentNode.lptr;
				currentNode.lptr.rptr = newNode;
				currentNode.lptr = newNode;
			}
		}
	}


	public void deleteNode(int value){
		if(last==null){
			System.out.println("List is Empty");
			return;
		}
		Node currentNode = first;
		if(currentNode.info==value){   // Remove first node
			first = currentNode.rptr;
			return;
		}
		while(currentNode.info==value){
			currentNode = currentNode.rptr;
		}
		if(currentNode==null){
			System.out.println("Node is Not Found");
			// return;
		}
		else if(currentNode==last){
			currentNode.lptr.rptr = null;
		}
		else{
			currentNode.lptr.rptr = currentNode.rptr;
			currentNode.rptr.lptr = currentNode.lptr;
		}
	}


	public void deleteAlternateNode(){
		if(first==null){
			System.out.println("List is Empty");
			return;
		}
		Node currentNode = first;
		int count = 1;
		while(currentNode!=null){
			Node nextNode = currentNode.rptr;
			if(count%2!=0){
				count++;
				currentNode = nextNode;
				continue;
			}
			if(currentNode.lptr!=null){
				currentNode.lptr.rptr = currentNode.rptr;
			}
			if(currentNode.rptr != null){
				currentNode.rptr.lptr = currentNode.lptr;
			}
			currentNode = nextNode;
			count++;
		}

		System.out.println();
		System.out.print("After Remove Alternate Node : " );
		display();
	}


	public void display(){
		Node currentNode = first;
		System.out.print("Doubly LinkedList : ");
		while(currentNode!=null){
			if(currentNode.rptr==null){
				System.out.print(currentNode.info );
			}
			else{
				System.out.print(currentNode.info + " <-> ");
			}
			currentNode = currentNode.rptr;
		}
		System.out.println();
	}
}

public class DoublyLinkedList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Node n = new Node(100);

		while(true){
			System.out.println();
			System.out.println("Enter 1 for insert at front of the list");
			System.out.println("Enter 2 for insert at last of the list");
			System.out.println("Enter 3 for insert at Middle(Before Enter Position) of the list");
			System.out.println("Enter 4 for delete Node of the list");
			System.out.println("Enter 5 for remove Alternate node from the list");
			System.out.println("Enter 6 for display of the list");
			System.out.println("Enter 9 for exit from the list");

			System.out.println();
			int choice = sc.nextInt();

			switch(choice){
				case 1 : System.out.print("Enter value to insert at front : ");
						 int value = sc.nextInt();
						 n.insertAtFirst(value);
						 break;

				case 2 : System.out.print("Enter value to insert at last : ");
						 value = sc.nextInt();
						 n.insertAtLast(value);
						 break;

				case 3 : System.out.print("Enter new value to insert at Middle(Before Enter Position) : ");
						 value = sc.nextInt();
						 System.out.print("Enter Position : ");
						 int position = sc.nextInt();
						 n.insertAtMiddle(value,position);
						 break;

				case 4 : System.out.print("Enter value to delete from the list : ");
						 value = sc.nextInt();
						 n.deleteNode(value);
						 break;


				case 5 : n.deleteAlternateNode();
						 break;

				case 6 : n.display();
						 break;

				case 9 : System.exit(0);
			}
		}
	}
}