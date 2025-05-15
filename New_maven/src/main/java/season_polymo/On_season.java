package season_polymo;

public class On_season extends Off_season {
	void discount(double price)
	{
		System.out.println("price after 40 % Onseason discount : "+ ( price *0.60));
	}

	public static void main(String[] args) {
	double price=1000;
	Off_season off= new Off_season();
	off.discount(price);
	On_season on=new On_season();
	on.discount(price);
			
			

	}

}
