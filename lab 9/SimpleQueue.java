// 50. Write a menu driven program to implement following operations on the Queue
// using an Array
// 1. ENQUEUE
// 2. DEQUEUE
// 3. DISPLAY

import java.util.*;

class Queue {
	int[] q;
	int length;
	int front;
	int rear;

	//Constructor for initialize value
	public Queue(int length){
		this.length = length;
		this.front = -1;
		this.rear = -1;
		this.q = new int[length];
	}

	//Enqueue Method for add an element to the queue
	public void enqueue(int value){
		if(rear==length-1){
			System.out.println("Queue is OverFlow.");
			return;
		}

		if(front==-1){
			front = 0;
		}

		rear++;
		q[rear] = value;
	}

	//Dequeue Operation for remove an element from the queue
	public int dequeue(){
		if(front==-1){
			System.out.println("Queue is UnderFlow");
			return -1;
		}
		
		int value = q[front];
		// q[front] = -1;

		if(front==rear){ // if only 1 one element
			front = -1;  
			rear = -1;
		}
		else{
			front++;  // general case
		}
		return value;
	}

	//Display operation for show the current state of the queue
	public void display(){
		System.out.println();
		if(front==-1){
			System.out.println("Queue is Empty");
		}
		else{
			System.out.print("Simple Queue : ");
			for(int i=front; i<=rear; i++){
				System.out.print(q[i] + " ");
			}
			System.out.println();
		}
	}
}

public class SimpleQueue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Get length of queue from user
        System.out.print("Enter the length of the queue : ");
        int length = sc.nextInt();

        // create object of class Queue
        Queue queue = new Queue(length);

        while(true){
        	// menu of operation
        	System.out.println("\nQueue Operation Menu,");
        	System.out.println("1. ENQUEUE");
        	System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");

            System.out.println();
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice) {
            	case 1:
                    // ENQUEUE operation
                    System.out.print("Enter the item to enqueue: ");
                    int item = sc.nextInt();
                    queue.enqueue(item);
                    break;

                case 2:
                    // DEQUEUE operation
                    int dequeuedValue = queue.dequeue();
                    if (dequeuedValue != -1) {
                        System.out.println("Dequeued value: " + dequeuedValue);
                    }
                    break;

                case 3:
                    // DISPLAY operation
                    queue.display();
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                	// if choice is not in menu
                    System.out.println("Invalid choice!");
            }
        }
	}
}