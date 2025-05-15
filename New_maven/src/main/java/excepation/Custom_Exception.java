package excepation;

public class Custom_Exception {

	public static void main(String[] args) throws VotingException {
		int age=16; 
		if (age>=18)
		{
			System.out.println("age foris eligible for votting" );

	}
		else
		{
			throw new VotingException("not eligible");
		}
	}
}
