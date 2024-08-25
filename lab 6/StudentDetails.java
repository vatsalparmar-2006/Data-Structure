// 35. Create array of object of class Student_Detail with attributes Enrollment_No,
// Name, Semester, CPI for 5 students, scan their information and print it.

import java.util.*;

public class StudentDetails {
	public static void main(String[] args) {
		
		Student_Detail[] stu = new Student_Detail[5];

		for(int i=0; i<stu.length; i++){
			stu[i] = new Student_Detail();
		}

		for(int i=0; i<stu.length; i++){
			stu[i].getDetail();
		}

		for(int i=0; i<stu.length; i++){
			stu[i].printDetail();	
		}
	}
}

class Student_Detail {
	int enrollment_no;
	String name;
	int semester;
	float spi;

	public void getDetail(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Enrollment Number : ");
		enrollment_no = sc.nextInt();
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.print("Enter Semester : ");
		semester = sc.nextInt();
		System.out.print("Enter SPI : ");
		spi = sc.nextFloat();
	}

	public void printDetail(){
		System.out.println();
		System.out.println("Student's  Enrollment Number : "+enrollment_no);
		System.out.println("Student's  Name : "+name);
		System.out.println("Student's  Semester : "+semester);
		System.out.println("Student's  SPI : "+spi);
		System.out.println();
	}
}