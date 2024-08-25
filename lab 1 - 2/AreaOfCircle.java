// 1. Write a program to calculate area of a Circle (A = πr2).

import java.util.*;

public class AreaOfCircle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius for circle : ");
		double r = sc.nextDouble();

		double area = Math.PI*r*r;

		System.out.println("Area of Circle : "+area);
	}
}