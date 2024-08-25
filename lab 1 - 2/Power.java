// 6. Write a program to find power of a number using loop.

import  java.util.*;

public class Power {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter base value x = ");
		int x = sc.nextInt();

		System.out.println("Enter power value y = ");
		int y = sc.nextInt();

		double ans = 1.00;
		for(int i=1 ; i<=y ; i++){
			ans = ans*x ;
		}

		System.out.println("Answer : "+ans);
	}
}