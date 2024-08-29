// 45. Write a program to convert infix notation to postfix notation using stack.

import java.util.*;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {

        Postfix object=new Postfix();
        object.infixToPostfix();
    }
}

class Postfix{

    public int inputPrecedence(char ch){
        
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
                    return 2;
                    
            case '*':
            case '/':
                    return 4;

            case '^':
                    return 5;

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

    public void infixToPostfix(){

        Scanner sc=new Scanner(System.in);

        Stack<Character> stk=new Stack<>();

        System.out.print("Enter the Infix Notation : ");
        String infix=sc.nextLine();

        infix += ')';
        String polish="";
        int rank=0;

       
        stk.push('(');
       
       for(char c : infix.toCharArray()){
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

       if(rank!=1){
            System.out.println("\nInvalid");
       }
       else{
          System.out.println("\nValid");
       }

    
       System.out.println("\nInfix : "+infix);
       System.out.println("Postfix : "+polish);
       System.out.println("Rank : "+rank);
    }
}