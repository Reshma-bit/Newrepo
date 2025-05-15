package inheritance_example;

public class Salary extends Employee{
	
	
	    double hra, pf;
		protected double basicPay;

	    void calculateComponents() {
	        hra = 0.05 * basicPay;
	        pf = 0.20 * basicPay;
	    }
	}


