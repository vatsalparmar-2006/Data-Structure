// 7. Write a program to find factors of a given number.

import java.util.*;

public class Factors {
	public static void main(String[] args) {
		//factor,
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int n = sc.nextInt();

		System.out.print("Factor is : ");
		for(int i=1 ; i<=n ; i++){
			if(n%i==0){
				System.out.print(i +", ");
			}
		}
	}
}