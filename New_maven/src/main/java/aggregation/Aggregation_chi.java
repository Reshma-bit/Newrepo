package aggregation;

public class Aggregation_chi {
	String place;
	int strid;
	Aggregation_pare ref;
	public Aggregation_chi(String place,int strid,Aggregation_pare ref)
	{
		this.place=place;
		this.strid=strid;
		this.ref=ref;
	}
	public void display()
	{
	System.out.println(place+strid);
	System.out.println(ref);
	}
	public static void main(String[] args) {
		
		Aggregation_pare obj=new Aggregation_pare("trivandrum",78);
		Aggregation_chi object = new Aggregation_chi("trivandrum",78,obj);
		object.display();
				

	}
}
	
