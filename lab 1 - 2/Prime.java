// 8. Write a program to check whether a number is prime or not.

import java.util.*;

public class Prime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		int n = sc.nextInt();

		int count=0;

		for(int i=2; i<=n/2; i++){
			if(n%i==0){
				count++;
				break;
			}
		}
		if(count==0){
			System.out.println("Number is Prime");
		}
		else{
			System.out.println("Number is not Prime");
		}
	}
}