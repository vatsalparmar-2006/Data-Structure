// 40. Write a program to determine if an input character string is of the form aibi
// where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’

import java.util.Stack;
import java.util.Scanner;

public class CheckForm {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Stack<Character> a = new Stack<Character> ();
		Stack<Character> b = new Stack<Character> ();

		System.out.println();
		System.out.print("Enter string using a and b Character : ");
		String str = sc.next();
		str = str.toLowerCase();

		for (int i=0 ;i<str.length() ;i++ ) {
			if(str.charAt(i)=='a'){
				a.push(str.charAt(i));
			}
			else{
				b.push(str.charAt(i));
			}
		}

		System.out.println();
		if(a.size()==b.size()){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
	}
}