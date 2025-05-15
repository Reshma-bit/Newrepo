package abstraction;

public class Contractor extends Abstract_class_Employee {
	int paymentperhour=100;
	int hoursworked=6;
	

@Override
void calculatesalary() 
{
	
	System.out.println("ContractorSalary :" + (paymentperhour *hoursworked));


	
}
	 

}
