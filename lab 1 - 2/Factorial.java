// 4. Write a program to find factorial of a number. (Using Loop)

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int n = sc.nextInt();

		int ans=1;
		for(int i=1 ; i<=n ; i++){
			ans = ans*i;
		}

		System.out.println("Factorial of Number is : "+ans);
	}
}