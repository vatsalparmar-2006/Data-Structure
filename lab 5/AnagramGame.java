// 32. Design anagram game using array.
//  Allow a user to enter N words and store it in an array.
//  Generate a random number between 0 to N-1.
//  Based on the random number generated display the word stored at that
// index of an array and allow user to enter its anagram.
//  Check whether the word entered by the user is an anagram of displayed
// number or not and display an appropriate message.
//  Given a word A and word B. B is said to be an anagram of A if and only if
// the characters present in B is same as characters present in A,
// irrespective of their sequence. For ex: “LISTEN” == “SILENT”

import java.util.*;

public class AnagramGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter n ");
		int n = sc.nextInt();

		String[] words = new String[n];
		for(int i=0; i<words.length; i++){
			System.out.print("Enter element of words["+(i+1)+"]");
			words[i] = sc.next().toLowerCase();
		}

		int random = (int)(Math.random()*(n-1));

		System.out.println("Random word of Array : "+words[random]);

		System.out.print("Enter a word to check Anagram : ");
		String word1 = sc.next().toLowerCase();

		char[] randomWord = words[random].toCharArray();
		char[] userWord = word1.toCharArray();

		Arrays.sort(randomWord);
		Arrays.sort(userWord);

		if(word1.length()!=words[random].length()){
			System.out.println("Not Anagram");
		}
		else{
			for(int i=0; i<userWord.length; i++){
				if(randomWord[i]!=userWord[i]){
					System.out.println(word1 +" is not Anagram of "+ words[random]);
					return;
				}
			}
			System.out.println(word1 +" is Anagram of "+words[random]);
		}
	}
}