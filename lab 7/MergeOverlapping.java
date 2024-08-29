// 43. Given a set of time intervals in any order, our task is to merge all overlapping
// intervals into one and output the result which should have only mutually
// exclusive intervals
//  Input: Intervals = {{1,3},{2,4},{6,8},{9,10}}
// o Output: {{1, 4}, {6, 8}, {9, 10}}
// o Explanation: Given intervals: [1,3],[2,4],[6,8],[9,10], we have only
// two overlapping intervals here,[1,3] and [2,4]. Therefore we will
// merge these two and return [1,4],[6,8], [9,10]
//  Input: Intervals = {{6,8},{1,9},{2,4},{4,7}}
// o Output: {{1, 9}}
//  Reference : https://www.geeksforgeeks.org/merging-intervals/

import java.util.*;
import java.util.Stack;

class Data{
    int first, last;
    
    public Data(int first,int last){
        this.first=first;
        this.last=last;
    }
}
class Solve{
    public void merge(Data array[]){
        if(array.length==0){
            return;
        }

        array=sort(array);

        Stack<Data> stk = new Stack<>();

        stk.push(array[0]);

        for(Data i : array){
            Data top=stk.peek();

            if(top.last<i.first){
                stk.push(i);
            }
            else if(top.last<i.last){
                top.last=i.last;
                stk.pop();
                stk.push(top);
            }
        }

        System.out.print("After Merging: {");
        while (!stk.isEmpty()){
            Data d=stk.pop();
            System.out.print("{"+d.first+","+d.last+"}");
        }
        System.out.println("}");
    }

    public Data[] sort(Data array[]){
            for(int i=0; i<array.length-1; i++){
                for(int j=0; j<array.length-i-1; j++){
                    if(array[j].first>array[j+1].first){
                        Data temp=array[j+1];
                        array[j+1]=array[j];
                        array[j]=temp;
                    }
                }
            }
            
            return array;
    }
}
public class MergeOverlapping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Solve ans = new Solve();

        System.out.print("Enter the total number of interval : ");
        int n=sc.nextInt();

        Data interval[] = new Data[n];

        for(int i=0; i < n; i++){
            System.out.println("For interval " + (i + 1));
			System.out.print("\tEnter start : ");
			int s = sc.nextInt();
			System.out.print("\tEnter end : ");
			int e = sc.nextInt();

			interval[i] = new Data(s, e);
        }

        System.out.print("Question: {");
        for (Data i: interval){
            System.out.print("{"+i.first+","+i.last+"}");
        }
        System.out.println("}");

        ans.merge(interval);
        sc.close();
    }
}