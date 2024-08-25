// 14. Write a program to calculate sum of numbers from m to n.

import java.util.*;

public class SumOfGivenRange {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start point : ");
		int m = sc.nextInt();

		System.out.print("Enter end point : ");
		int n = sc.nextInt();
			int ans=0;
		for(int i=m; i<=n; i++){
			ans=ans+i;
		}

		System.out.println("Answer(Sum of series) is : "+ans);
	}
}