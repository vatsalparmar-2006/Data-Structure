// 5. Write a program to find factorial of a number. (Using Recursion)

import java.util.*;

public class RecursiveFactorial {

	int factorial(int n){

			if(n==0){
				return 1;
			}
			else{
				return n*factorial(n-1);
			}
		}

	public static void main(String[] args) {

		 //factorial using Recursion

		Scanner sc = new Scanner(System.in); 

		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		int fact=1;
		fact=factorial(n);
		System.out.println("Factorial using Recursion : "+fact);
	}
}