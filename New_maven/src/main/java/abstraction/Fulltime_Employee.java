package abstraction;

public class Fulltime_Employee extends Abstract_class_Employee
 {
	int paymentPerHour=150;
	
	
		

	
	
		


	@Override
	void calculatesalary()
	{
	System.out.println("FullTime Employee Salary :"+(paymentPerHour * 8));	
		
	}
	public static void main(String[] args)
	{
		Abstract_class_Employee Contractor=new Contractor();
		Abstract_class_Employee Fulltime_Employee =new Fulltime_Employee();
		Contractor.calculatesalary();
		Fulltime_Employee.calculatesalary();
		
		
		// TODO Auto-generated method stub
		
	}

}
