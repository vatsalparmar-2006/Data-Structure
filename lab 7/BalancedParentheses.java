// 41. Chef has a string which contains only the characters '{', '}', '[', ']', '(' and ')'. Now
// Chef wants to know if the given string is balanced or not. If is balanced then
// print 1, otherwise print 0.
//  A balanced parenthesis string is defined as follows:
// o The empty string is balanced
// o If P is balanced then (P), {P}, [P] is also balanced
// o if P and Q are balanced PQ is also balanced
// o "([])", "({})[()]" are balanced parenthesis strings
// o "([{]})", "())" are not balanced.
//  Input: The first line of the input contains a single integer T denoting the
// number of test cases. The description of T test cases follows. The first
// and only line of each test case contains a single string
//  Output: For each test case, print a single line containing the answer.
//  Example of Input & Output
// o Input:
//  Enter No of Test Cases: 4
//  ()
//  ([)]
//  ([{}()])[{}]
//  [{{}]
// o Output
//  1
//  0
//  1
//  0
import java.util.Stack;
import java.util.Scanner;

public class BalancedParentheses {    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of cases : ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            String input=sc.nextLine();
            System.out.println(isBalanced(input)?1:0);
        }

        sc.close();
    }

    public static boolean isBalanced(String str){
        Stack<Character> stk=new Stack<>();
    
        for(char ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(stk.isEmpty()){
                    return false;
                }
    
                char top=stk.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}