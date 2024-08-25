// 9. WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS
// [e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].

import java.util.*;

public class TimeFormat {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
		System.out.println();
		System.out.print("Enter time in seconds : ");
        int seconds = sc.nextInt();
        System.out.println();
        
        int hours = seconds/3600;

        int minutes = (seconds%3600)/60;

        int remainingSeconds = seconds%60;

        System.out.println(hours + " : " + minutes + " : " + remainingSeconds);
    }   
}
