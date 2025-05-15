package abstraction;

public class Abstract_child extends Abstract_pare {

	public static void main(String[] args) {
		
		Abstract_child obj=new Abstract_child();
				obj.show();
				obj.sound();
				obj.sum();
				obj.chard();
				

	}

	@Override
	public void show() {
		
		System.out.println("abstract");
		
	}

	@Override
	public void sound() {
		System.out.println("sound");
		// TODO Auto-generated method stub
		
	}
	public void chard()
	{
	System.out.println("method");	
	}

}

