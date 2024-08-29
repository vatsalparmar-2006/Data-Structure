import java.util.Scanner;
import java.util.Stack;

public class REMOVESTAR {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        String string;
        String answer = "";

        while(true){
            System.out.print("Enter the String:");
            string = sc.nextLine();

            if(string.charAt(0)=='*'){
                System.out.println("Invalid String Please try Again.");
            }else{
                break;
            }
        }

        Stack<Character> stk=new Stack<>();

        for(char ch: string.toCharArray()){
            if(ch=='*'){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }

        while (!stk.isEmpty()){
            char ch=stk.pop();
            answer+=ch;
        }

        for(char ch: answer.toCharArray()){
            stk.push(ch);
        }

        String Ranswer="";
        
        while (!stk.isEmpty()){
            char ch=stk.pop();
            Ranswer+=ch;
        }

        System.out.println("After removing stars: "+Ranswer);
        sc.close();
    }
}