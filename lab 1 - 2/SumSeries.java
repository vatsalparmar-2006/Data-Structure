// 11. WAP to find the sum of 1 + (1+2) + (1+2+3) + (1+2+3+4)+ …+(1+2+3+4+….+n).

import java.util.*;

public class SumSeries {
	public static void main(String[] args) {
		
		// 1 + (1+2) + (1+2+3) + ...+(1+2+3+4+...+n).
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter end value for series : ");
		int n = sc.nextInt();
		int sum=0;

		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				sum +=j ;
			}
		}
		System.out.println();
		System.out.println("Sum of series is "+sum);
	}
}