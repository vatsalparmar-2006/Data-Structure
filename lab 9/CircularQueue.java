// 51. Write a menu driven program to implement following operations on a circular
// queue using an Array
// 1. Insert
// 2. Delete
// 3. Display all elements of the queue

import java.util.*;

class Cir_Queue {
	int[] q;
	int length;
	int front;
	int rear;

	//Constructor for initialize value
	public Cir_Queue(int length){
		this.length = length;
		this.front = -1;
		this.rear = -1;
		this.q = new int[length];
	}

	//Insert Operation for add an element to the queue
	public void insert(int value){
		if((rear + 1) % length == front){
			System.out.println("Queue is OverFlow");
			return;
		}

		rear = (rear+1)%length;
		q[rear] = value;

		if(front==-1){
			front = 0;
		}
	}

	//Dequeue Operation for remove an element from the queue
	public int dequeue(){
		if(front==-1){
			System.out.println("Queue is UnderFlow");
			return -1;
		}
		
		int value = q[front];
		// q[front] = -1;

		if(front==rear){  //if only 1 element
            front=-1;
            rear=-1;
            return value;
        }

        if(front==length-1){
            front=0;
        }
        else{
            front++; // general case
        }

		return value;
	}

	//Display operation for show the current state of the queue
	public void display(){
		if(front==-1){
			System.out.println("Queue is Empty");
			return;
		}

		int i = front;
        while (true) {
            System.out.print(q[i] + "...");
            if(i == rear){
                break;
            }

            i = (i+1) % length;
        }
        System.out.println();
	}
}

public class CircularQueue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Get length of queue from user
        System.out.print("Enter the length of the queue : ");
        int length = sc.nextInt();

        // create object of class Queue
        Cir_Queue queue = new Cir_Queue(length);

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
                    queue.insert(item);
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