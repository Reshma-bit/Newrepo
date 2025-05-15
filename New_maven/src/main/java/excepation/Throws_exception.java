package excepation;

public class Throws_exception {
	

	public static void main(String[] args) throws Exception {
		
		int age=16; 
		if (age>=18)
		{
			System.out.println("age foris eligible for votting" );
		}
		else
		{
			throw new Exception("not eligible");	
		}
	}

}
