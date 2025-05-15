package super_keyword;

public class Super_childconstructor extends Super_constructor  {
public Super_childconstructor()
{
	super(4,6);
	System.out.println("child class constructor");
}
public Super_childconstructor(int a,int b)
{
	super(7);
	System.out.println(a+b);
}

	public static void main(String[] args) {
		Super_childconstructor objname=new Super_childconstructor();
		Super_childconstructor obj1=new Super_childconstructor(7,0);
	 	//Super_constructor obj1=new Super_constructor();
		
		
		
		// TODO Auto-generated method stub

	}

}
