// 3. Write a program to determine whether the entered character is vowel or not.

import java.util.*;

public class CheckVowel {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character : ");
		String str = sc.next();

		str = str.toUpperCase();

		if(str.charAt(0)=='A' || str.charAt(0)=='E' || str.charAt(0)=='O' || str.charAt(0)=='I' || str.charAt(0)=='U'){
			System.out.println("Character is Vowel");
		}
		else{
			System.out.println("Character is not Vowel");
		}
	}
}