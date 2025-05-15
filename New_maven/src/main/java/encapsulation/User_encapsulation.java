package encapsulation;

import java.util.Scanner;

public class User_encapsulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank_encapsulation bank=new Bank_encapsulation();
		System.out.println("Enter pin: ");
		int p= sc.nextInt();
		bank.setpin(p);
		bank.checkpin();
 
	}

}
