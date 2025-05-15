package super_keyword;

public class Super_methodchild extends Super_methodparent {
	public void display()
	
	{
		this.show();
		super.display1();
		super.sum(3, 4);
		System.out.println("these is a super child");
	}
	public void show()
	{
		System.out.println("these is method 2");
	}
	public static void main(String[] args) {
		Super_methodchild objname=new Super_methodchild();
		objname.display();
		//objname.display1();
		// TODO Auto-generated method stub

	}

}
