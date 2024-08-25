// 36. Create methods to convert temperature from Celsius to Fahrenhit and vice
// versa. Take temperature input from user and call the appropriate conversion
// method.

import java.util.*;

public class ConvertTemperature {
	public static void main(String[] args) {
		
		convertTemperature();
	}

	public static void convertTemperature() {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Choose type of conversion, \n 1.Fahrenheit to Celsius \n 2.Celsius to Fahrenheit");
		System.out.println();
		int choose = sc.nextInt();

		double c,f;

		switch(choose){

			case 1 : System.out.print("Enter Fahrenheit Temperature : ");
						f = sc.nextDouble();
						c = (f-32)*(5/9);
						System.out.println("Celsius Temperature is "+c);
					break;
			case 2 : System.out.print("Enter Celsius Temperature : ");
						c = sc.nextDouble();
						f = ((9*c)/5) + 32;
						System.out.println("Fahrenheit Temperature is "+f);
					break;
					
			default : System.out.println("Invalid Temperature");
		}	
	}
}

