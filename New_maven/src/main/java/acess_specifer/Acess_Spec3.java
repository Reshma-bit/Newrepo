package acess_specifer;


public class Acess_Spec3 extends Acess_chil{

	public static void main(String[] args) {
		Acess_Spec3 obj=new Acess_Spec3();
		obj.promethod();
		obj.pubmethod();
		//obj.defmethod();it cannot be accessed outside the package
		//obj.primethod();it cannot be acessed outside the class

	}

}
