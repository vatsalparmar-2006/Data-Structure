// 56. Write a program to implement a node structure for singly linked list. Read the
// data in a node, print the node.

import java.util.*;

class Node {
	int info;
	Node link;

	public Node(int data){
		this.info = data;
		this.link = null;
	}
}

public class LinkedListDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();

		System.out.print("Enter value/data of first node : ");
		int data1 = sc.nextInt();
		Node first = new Node(data1);

		System.out.print("Enter value/data of second node : ");
		int data2 = sc.nextInt();
		first.link = new Node(data2);

		System.out.print("Enter value/data of third node : ");
		int data3 = sc.nextInt();
		first.link.link = new Node(data3);

		System.out.print("Enter value/data of fourth node : ");
		int data4 = sc.nextInt();
		first.link = new Node(data4);

		System.out.print("Enter value/data of fifth node : ");
		int data5 = sc.nextInt();
		first.link = new Node(data5);

		System.out.println();
		System.out.print("First Node's value of linked list is ");
		printList(first);
	}

	public static void printList(Node first){
		Node currNode = first;
		while(currNode.link != null){
			System.out.println(currNode.info + " ");
			currNode = currNode.link;
		}
	}
}