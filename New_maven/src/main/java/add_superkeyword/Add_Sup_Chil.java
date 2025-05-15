package add_superkeyword;

public class Add_Sup_Chil extends Add_Sup_Pare{
	public void division (int a,int b)
	
	{
		int result=super.addition(a, b);
		System.out.println("the result of addition is:"+result);
		if(result%10==0)
		{
			System.out.println("the result is divided by 10");
		}
				
		else
		{
			System.out.println("the result is not avialible by 10");
		}
	}

	public static void main(String[] args) {
		Add_Sup_Chil obj=new Add_Sup_Chil();
		obj.division(10,68);

	}

}
