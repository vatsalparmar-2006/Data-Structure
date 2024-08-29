//44. Codechef

import java.util.Scanner;
import java.util.Stack;

public class VOWELX{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String question=sc.nextLine();
        String vowel="aeiouAEIOU";
        String answer="";

        Stack<Character> stk = new Stack<>();

        for(char ch: question.toCharArray()){

            if(vowel.indexOf(ch)>-1){
                answer="";
                while(!stk.isEmpty()){
                    answer+=stk.pop();
                }
                answer+=ch;
                for(char a: answer.toCharArray()){
                    stk.push(a);
                }
            }else{
                stk.push(ch);
            }

        }   


        StringBuilder temp = new StringBuilder();
            while(!stk.isEmpty() && vowel.indexOf(stk.peek()) < 0){
                temp.append(stk.pop());
            }

            answer += temp.reverse().toString();

        System.out.println(answer);
        sc.close();
    }
}