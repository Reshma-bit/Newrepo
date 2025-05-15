package abstraction;

public class Non_Abstract extends Abstract_exampl{

	public static void main(String[] args) {
		Abstract_exampl obj=new Non_Abstract();
		obj.show();
		obj.sound();
		obj.//not reference of a abstract class
		
		
		
	}

	@Override
	public void show() {
		System.out.println("reshma");
		// TODO Auto-generated method stub
		
	}

	public void method()
	{
		System.out.println("obsqure");
	}
}
