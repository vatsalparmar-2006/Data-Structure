// 20. WAP to sort the N names in an alphabetical order.

import java.util.*;

public class SortNames {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a string : ");
      String str = sc.next();

      char charArray[] = str.toLowerCase().toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
   }
}