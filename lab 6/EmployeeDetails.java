// 34. Create class Employee_Detail with attributes Employee_ID, Name, Designation,
// and Salary. Write a program to read the detail from user and print it.

import java.util.*;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		Employee_Detail[] employee = new Employee_Detail[3];

		for(int i=0; i<employee.length; i++){
			employee[i] = new Employee_Detail(i+1);
		}

		for(int i=0; i<employee.length; i++){
			employee[i].getDetail(i+1);
		}
		for(int i=0; i<employee.length; i++){
			employee[i].printDetail(i+1);	
		}
	}
}

class Employee_Detail {
	int employee_id;
	String name;
	String designation;
	double salary;

	public Employee_Detail(int i){
		employee_id = 0;
		name = null;
		designation = null;
		salary = 0;
	}
	
	public void getDetail(int i){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID of employee "+i+" : ");
		employee_id = sc.nextInt();
		System.out.print("Enter Name of employee "+i+" : ");
		name = sc.next();
		System.out.print("Enter Designation of employee "+i+" : ");
		designation = sc.next();
		System.out.print("Enter Salary of employee "+i+" : ");
		salary = sc.nextDouble();
		System.out.println();
	}

	public void printDetail(int i){
		System.out.println();
		System.out.println("Employee  ID of employee "+i+" : "+employee_id);
		System.out.println("Employee  Name of employee "+i+" : "+name);
		System.out.println("Employee  Designation of employee "+i+" : "+designation);
		System.out.println("Employee  Salary of employee "+i+" : "+salary);
		System.out.println();
	}
}