// 12. WAP to print Armstrong number from 1 to 1000.

import java.util.*;

public class Armstrong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a,sum=0,rem;

		System.out.println();
		System.out.print("Armstrong number between 1 to 1000 : ");

		for(int i=1; i<=1000; i++){

			a=i;
			while(a!=0){
				rem = a%10;
				sum = sum + (rem*rem*rem);
				a = a/10;
			}

			if(sum==i){
				System.out.print(i +" ");
			}
			sum=0;
		}
	}
}