// 52. Write a menu driven program to implement following operations on the
// Doubled Ended Queue using an Array
//  Insert at front end, Insert at rear end
//  Delete from front end, Delete from rear end
//  Display all elements of the queue

import java.util.*;

class DoubledEnded_Queue{
    int[] queue;
    int rear;
    int front;
    int size;

    DoubledEnded_Queue(int size){
        this.size=size;
        this.queue=new int[size];
        this.front=-1;
        this.rear=-1;
    }

    public void dqInsertRear(int x){
        if(rear==size-1){
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if(front==-1){
            front=0;
        }
        queue[++rear]=x;
    }

    public void dqInsertFront(int x){
        if(front==0){
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        
        if(front==-1){
            front=0;
            rear=0;
        }
        else{
            front--;
        }
   
        queue[front]=x;
        return;
    }

    public int dqDeleteFront(){
        if(front==-1){
            System.out.println("Queue is empty. Cannot dequeue.");
            return 0;
        }

        int y=queue[front];

        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front++;
        }
        return y;
    }

    public int dqDeleteRear(){
        if(rear==-1){
            System.out.println("Queue is empty. Cannot dequeue.");
            return 0;
        }

        int y=queue[rear];
        // queue[rear]=0;

        if(rear==front){
            rear=-1;
            front=-1;
        }else{
            rear--;
        }

        return y;
    }

    public void display(){
        if(front==-1){
            System.out.println("Queue is empty.!");
            return;
        }

        System.out.println("Queue Elements: ");
        for(int i=front; i<=rear; i++){
            System.out.print(queue[i]+"...");
        }
        System.out.println("");
    }
}


public class DoubledEndedQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the queue : ");
        int size = sc.nextInt();

        DoubledEnded_Queue queue = new DoubledEnded_Queue(size);

        while (true){
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. ENQUEUE from front");
            System.out.println("2. DEQUEUE from front");
            System.out.println("3. ENQUEUE from rear");
            System.out.println("4. DEQUEUE from rear");
            System.out.println("5. DISPLAY");
            System.out.println("6. EXIT");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = sc.nextInt();
                    queue.dqInsertFront(element);
                    break;

                case 2:
                    int dequeuedValue = queue.dqDeleteFront();
                    if (dequeuedValue != -1) {
                        System.out.println("Dequeued value: " + dequeuedValue);
                    }
                    break;

                case 3:
                    System.out.print("Enter the element to enqueue: ");
                    element = sc.nextInt();
                    queue.dqInsertRear(element);
                    break;

                case 4:
                     dequeuedValue = queue.dqDeleteRear();
                    if (dequeuedValue != -1) {
                        System.out.println("Dequeued value: " + dequeuedValue);
                    }
                    break;

                case 5:
                    queue.display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(1);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 

    }
    
}