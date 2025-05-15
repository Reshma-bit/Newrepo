package aggergation_class;

public class Address_aggre {
	String address;
	void getaddress(String address)
	{
		this.address=address;
	
	}
    void printdetails(Student_aggre s)
{
	System.out.println("Name : "+ s.name);
	System.out.println("Roll no: "+ s.rollno);
	System.out.println("Address:  "+ this.address);
	
}
	public static void main(String[] args) {
		Student_aggre s=new Student_aggre();
		Address_aggre a=new Address_aggre();
		s.getDetails("rahul" ,101);
		a.getaddress("chennai");
		a.printdetails(s);
		

	}

}
