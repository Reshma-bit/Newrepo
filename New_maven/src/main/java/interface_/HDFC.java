package interface_;

import java.util.Scanner;

public class HDFC implements RBI {
	
	    public void recurringDeposit(double amount, int duration) {
	        double maturityAmount = amount * duration + (amount * duration * interestRate) / 100;
	        System.out.println("After " + duration + " months, you will get: Rs. " + maturityAmount);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter monthly deposit amount: ");
	        double amount = sc.nextDouble();
	        System.out.print("Enter duration in months: ");
	        int months = sc.nextInt();

	        HDFC customer = new HDFC();
	        customer.recurringDeposit(amount, months);
	    }
	}

		// TODO Auto-generated method stub

	


