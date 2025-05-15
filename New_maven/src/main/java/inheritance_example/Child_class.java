package inheritance_example;

public class Child_class extends Intermediate {
	public void display3()
	{
		System.out.println("these is a child class");
	}

	public static void main(String[] args)
	
{
	Child_class obj=new Child_class();
	obj.display2();
	obj.display();
	obj.display3();
			
	}

}
