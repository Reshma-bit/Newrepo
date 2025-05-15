package inheritance_example;

public class Totalsalary  extends Salary{


	    double totalSalary;

	    void calculateTotalSalary() {
	        totalSalary = basicPay + hra - pf - deduction + bonus;
	    }
	}


