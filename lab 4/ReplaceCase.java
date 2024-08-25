// 27. WAP to replace lowercase characters by uppercase & vice-versa in a user specified
// string.

import java.util.*;

public class ReplaceCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Before Replace : ");
		String str = sc.next();
		String newStr = "";

		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)){
				newStr += Character.toUpperCase(ch);
			}
			else{
				newStr += Character.toLowerCase(ch);
			}
		}

		System.out.println();
		System.out.println("After Replace : "+newStr);
	}
}