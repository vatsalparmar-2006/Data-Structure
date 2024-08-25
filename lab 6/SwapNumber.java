// 33. Write a program to swap two numbers using user-defines method.

import java.util.*;

public class SwapNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping: num1 = " + num1 + ", num2 = " + num2);

        swap(num1,num2);
	}

	public static void swap(int a,int b){
		
			//1st method,
		int temp = a;
		a = b;
		b = temp;

			// 2nd method,
		// a = a+ b;
		// b = a-b;
		// a = a-b;

			// 3rd method,
		// a = a*b;
		// b = a/b;
		// a = a/b;

			//4th method(Bitwise XOR),
		// a = a ^ b;  
        // b = a ^ b;  
        // a = a ^ b; 

        	//5th method(Single line XOR),
		// a = a ^ b ^ (b = a); 

			//6th method(Refference method),
		// List<Integer> list = new ArrayList<>(Arrays.asList(5, 10));
        // Collections.swap(list, 0, 1); 
        // System.out.println("a = " + list.get(0) + ", b = " + list.get(1));


		System.out.println("After Swapping: num1 = " + a + ", num2 = " + b);
	}
}