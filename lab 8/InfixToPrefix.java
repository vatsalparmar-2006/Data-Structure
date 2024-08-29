// 46. Write a program to convert infix notation to prefix notation using stack.

import java.util.*;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        
        Prefix object=new Prefix();
        object.infixToPrefix();
    }
}
class Prefix{

    public int inputPrecedence(char ch){
        switch(ch){
            case '+':
            case '-':
                    return 2;
                    
            case '*':
            case '/':
                    return 4;

            case '^':
                    return 5;

            case '(':
                    return 9;
                  
            case ')':
                    return 0;

            default: return 7;
        }
    }

    public int stackPrecedence(char ch){

        switch(ch){
            case '+':
            case '-':
                    return 1;
                    
            case '*':
            case '/':
                    return 3;

            case '^':
                    return 6;

            case '(':
                    return 0;
    
            default: return 8;

        }
    }

    public int checkRank(char ch){

        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^'){
            return -1;
        }
    
        return 1;

    }

    public void infixToPrefix(){

        Scanner sc=new Scanner(System.in);

        Stack<Character> stk=new Stack<>();

        System.out.print("\nEnter the Infix Notation : ");
        String infix=sc.nextLine();

        String polish="";
        int rank=0;
        String reverseInfix="";

        for(int i=infix.length()-1;i>=0;i--){
            
            if(infix.charAt(i)==')'){
                reverseInfix+='(';
            }
            else if(infix.charAt(i)=='('){
                reverseInfix+=')';
            }
            else{
                reverseInfix+=infix.charAt(i);
            }
        }

        reverseInfix += ')';

        stk.push('(');
       
       for(char c : reverseInfix.toCharArray()){
            if(stk.isEmpty()){
                System.out.println("Invalid.!!");
                return;
            }
            
            while(stackPrecedence(stk.peek()) > inputPrecedence(c)){
                char temp=stk.pop();
                polish+=temp;
                rank+=checkRank(temp);

                if(rank<1){
                    System.out.println("Invalid");
                    return;
                }

            }

            if(stackPrecedence(stk.peek()) != inputPrecedence(c)){
                stk.push(c);
            }
            else{
                stk.pop();
            }

       }

       String reversePolish="";
       for(int i=polish.length()-1;i>=0;i--){
            
        if(polish.charAt(i)==')'){
            reversePolish+='(';
        }
        else if(polish.charAt(i)=='('){
            reversePolish+=')';
        }
        else{
            reversePolish+=polish.charAt(i);
        }
    }

    

       if(rank!=1){
            System.out.println("\nInvalid");
       }
       else{
          System.out.println("\nValid");
       }


       System.out.println("\nInfix : "+infix);
       System.out.println("Prefix : "+reversePolish);
       System.out.println("Rank : "+rank);

    }
}
