// 19. WAP to print Pascal triangle.

import java.util.*;

public class PascalTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter rows for  pascal triangle : ");
		int n = sc.nextInt();

		for(int i=0; i<n; i++){
			for(int j=0;j<n-i;j++){
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++){
				System.out.print(permutation(i,j)+" ");
			}
			System.out.println();
		}
	}

	static int fac(int a){
		int ans=1;
		for(int i=1; i<=a; i++){
			ans *= i;
		}

		return ans;
	} 

	static int permutation(int n,int m){
		//nCm = n!/(n-m)!*(m!)

		if(m==0) return 1;
		int a = fac(n);
		int b = fac(n-m);
		int c = fac(m);

		int d = a/(b*c);

		return d;
	}
}