package acess_specifer;

public class Acess_chil {
	public void pubmethod()
	{
		System.out.println("these is a public method");
	}
	private void primethod()
	{
		System.out.println("these is a private method");
	}
	protected void promethod()
	
	{
	 System.out.println("these is proctected method");        
	}
	void defmethod()
	{
		System.out.println("these is a default method");
	}

	
	public static void main(String[] args)
	{
		Acess_chil obj=new Acess_chil();
		obj.pubmethod();
		obj.primethod();
		obj.promethod();
	     obj.defmethod();

	}

}
