package over_ride;

public class Over_ride_child extends Over_ride_parent {
public void display(int a,int b)
{
	super.display(7, 6);
	int c= a-b;
	System.out.println(c);
}
	public static void main(String[] args) {
		Over_ride_child objname=new Over_ride_child();
		objname.display(8, 9);
          objname.spring();
          objname.spring1();
	}
	@Override
	public void spring() {
		// TODO Auto-generated method stub
		super.spring();
		System.out.println("these is a over ride ");
	}
	@Override
	public void spring1() {
		// TODO Auto-generated method stub
		super.spring1();
		System.out.println("another method");
	}

}
