// 17. Write a program to find whether the array contains a duplicate number or not.

import java.util.*;

public class CheckDuplicate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter length for array :");
		int n = sc.nextInt();

		int[]a = new int[n];
		for(int i=0; i<a.length; i++){
			System.out.print("Enter element of a["+(i+1)+"] : ");
			a[i] = sc.nextInt();
		}

		int count=0;
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
					count++;
				}
			}
		}
		System.out.println();
		if(count==0){
			System.out.println("There is no duplicate.");
		}
		else System.out.println("There is duplicate.");
	}
}