package aggregation;

public class Aggregation_child{
	String sub;
	int rollno;
	Aggregation_parent ref;
	public Aggregation_child(String sub,int rollno,Aggregation_parent ref)
{
		this.sub=sub;
		this.rollno=rollno;
		this.ref=ref;
				
	}
	public void display()
	{
		System.out.println(sub+rollno);
		System.out.println(ref.name+ref.mark);
	}

	public static void main(String[] args) {
		Aggregation_parent obj=new Aggregation_parent("reshma",79);
		Aggregation_child objname=new Aggregation_child("maths",50,obj);
		objname.display();
				
		// TODO Auto-generated method stub

	}

}
