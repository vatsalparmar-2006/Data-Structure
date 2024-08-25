// 18. Read n numbers in an array then read two different numbers, replace 1st
// number with 2nd number in an array and print its index and final array.

import java.util.Scanner;

public class ReplaceInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i<n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be replaced: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the replacement number: ");
        int num2 = scanner.nextInt();

        int index = -1;
        for (int i = 0; i<n; i++) {
            if (array[i] == num1) {
                array[i] = num2;
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The number " + num1 + " was replaced with " + num2 + " at index " + index);
        } else {
            System.out.println("The number " + num1 + " was not found in the array.");
        }

        System.out.println("The final array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


