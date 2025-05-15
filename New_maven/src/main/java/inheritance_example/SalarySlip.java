package inheritance_example;

public class SalarySlip extends Totalsalary{
	// Class 4 - Display Salary Slip

	    void displaySlip() {
	        System.out.println("\n---- Salary Slip ----");
	        System.out.println("Basic Pay: " + basicPay);
	        System.out.println("Deduction: " + deduction);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("HRA (5%): " + hra);
	        System.out.println("PF (20%): " + pf);
	        System.out.println("Total Salary in Hand: " + totalSalary);
	    }

	    public static void main(String[] args) {
	        SalarySlip emp = new SalarySlip();
	        emp.getDetails();
	        emp.calculateComponents();
	        emp.calculateTotalSalary();
	        emp.displaySlip();
	    

	}

}
