// 60. Write a program to implement stack using singly linked list.

class Node{
    int data;
    Node link;

    Node(int data){
        this.data=data;
        this.link=null;
    }
}

class LL{
    Node first;

    public void push(int data){
        Node newNode=new Node(data);
        if(first==null){
            first=newNode;
            return;
        }

        newNode.link=first;
        first=newNode;
    }

    public void pop(){
        if(first==null){
            System.out.print("Stack is Empty.!");
            return;
        }
        first=first.link;
    }

    public void display(){
        if(first==null){
            System.out.println("Stack is Empty.!");
            return;
        }

        Node temp=first;
        while (temp!=null){
            System.out.println("|  "+temp.data+"  |");
            temp=temp.link;
        }
        System.out.println("|______|");
    }
}

public class LLAsStack {
    public static void main(String[] args) {

        LL stk=new LL();

        stk.push(21);
        stk.push(14);
        stk.push(53);
        stk.push(85);
        stk.push(38);
        stk.push(62);

        stk.display();

        stk.pop();
        stk.pop();

        System.out.println("\nAfter popped: \n");
        stk.display();
    }   
}