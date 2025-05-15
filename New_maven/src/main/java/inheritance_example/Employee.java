package inheritance_example;

import java.util.Scanner;

public class Employee {
	double basic,deduction,bonus;
	void getDetails(){
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter basic pay :");
			basic=sc.nextDouble();
			System.out.println("Enter bonus :");
			bonus=sc.nextDouble();
		}
	}

}
