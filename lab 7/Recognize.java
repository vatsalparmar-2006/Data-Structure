// 39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a
// program to solve the above problem.

import java.util.Stack;
import java.util.Scanner;

public class Recognize {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<Character> s = new Stack<Character>();

		System.out.println();
		System.out.print("Enter string using a,b and c Character : ");
		String str = sc.next();
		str = str.toLowerCase();

		int count=0;

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='c'){
				break;
			}
			count++;
			s.push(str.charAt(i));
		}

		boolean flage = true;

		for(int i=count+1; i<str.length(); i++){
			char ch = s.pop();
			if(str.charAt(i)==ch){
				continue;
			}
			else{
				System.out.println("\nNot Recognize");
				flage = false;
				break;
			}
		}
		if(flage==true){
			System.out.println("\nRecognize");
		}
	}
}