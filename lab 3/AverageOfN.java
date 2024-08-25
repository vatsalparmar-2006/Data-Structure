// 15. Write a program to calculate average of first n numbers.

import java.util.*;

public class AverageOfN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		double n = sc.nextInt();

		double sum=0;

		for(int i=1 ; i<=n  ; i++){
			sum+=i ;
		}

		double average = sum/n ;
		System.out.println("Average is "+average);
	}
}