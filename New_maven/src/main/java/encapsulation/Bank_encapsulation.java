package encapsulation;

public class Bank_encapsulation {
	private int pin;
	public void setpin(int pin)

	{
		this.pin=pin;
	}
	public void checkpin()
	{
		if (pin== 1001 || pin==1234|| pin==1212)
        System.out.println( "valid pin withdrawal successful.");
else
	System.out.println("invalid pin");
	}
	

}
