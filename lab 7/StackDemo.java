import java.util.Scanner;

class Stack {
	int size;
	int top;
	int[] stackArray;

	//constructor for assining value
	public Stack(int size){
		this.size = size;
		stackArray = new int[size];
		top = -1;
	}

	//for insert element in stack(Array)
	public void push(int value){
		
		if(top>size){
			System.out.println("Stack is Overflow");  //check stack is full or not
		}
		else{
			top++;
			stackArray[top] = value;
		}
	}

	//for remove last element of stack(Array)
	public int pop(){
		
		if(top<0){
			System.out.println("Stack is Overflow");  //check stack is empty or not
			return -1;
		}
		else{
			top--;
			return stackArray[top+1];
		}
	}

	//for return last(top) element of stack(Array)
	public int peek(){
		
		if(top<0){
			System.out.println("Stack is Empty");  //check stack is empty or not
			return -1;
		}
		else{
			return stackArray[top];
		}
	}

	//for remove ith element of top of stack(Array)
	public int peep(int i){
		
		if(top-i<0){
			System.out.println("Stack is Empty");  //check stack is empty or not
			return -1;
		}
		else{
			return stackArray[top-i+1];
		}
	}

	//for change element in stack(Array)
	public int change(int index,int value){
		
		if(top-(index-1)<0){
			System.out.println("Stack is Empty");  //check stack is empty or not
			return -1;
		}
		else{
			stackArray[top-(index-1)] = value;
			System.out.println("Changed value at Order " + index + " to " + value);
			return 0;
		}
	}

	//for display element of stack(Array)
	public void display(){

		System.out.println();

		if(top<0){
			System.out.println("Stack is Empty");  //check stack is empty or not
		}
		else{
			for(int i=0; i<=top; i++){
				System.out.print(stackArray[i] +" ");
			}
		}
		System.out.println();
	}	
}

public class StackDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter length for Stack array : ");
		int l = sc.nextInt();

		Stack s = new Stack(l);

		while(true){
			System.out.println();
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. peep");
			System.out.println("5. change");
			System.out.println("6. display");
			System.out.println("7. exit");
			System.out.println();
			int choice = sc.nextInt();

			switch(choice){
				case 1 : System.out.print("Enter value to push : ");
						 int value = sc.nextInt();
						 s.push(value);
						 break; 

				case 2 : s.pop();
						 s.display();
						 break;

				case 3 : int a=s.peek();
						 System.out.println(a);
						 break;

				case 4 : System.out.print("Enter value to peep : ");
						  value = sc.nextInt();
						 int b=s.peep(value);
						 System.out.println(b);
						 break; 

				case 5 : System.out.print("Enter new value : ");
						  value = sc.nextInt();
						 System.out.print("Enter index to change : ");
						 int index = sc.nextInt();
						 s.change(index,value);
						 break; 

				case 6 : s.display();
						 break;

				case 7 : System.exit(0);
			}
		}
	}
}