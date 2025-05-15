package encapsulation;

public class Child_Encapsulation {

	public static void main(String[] args) {
		Parent_encapsulation obj=new Parent_encapsulation();
		obj.setPassword(6734);
		obj.setUsername("reshma@123");
		System.out.println(obj.getPassword());
		System.out.println(obj.getUsername());
	}

	

}
