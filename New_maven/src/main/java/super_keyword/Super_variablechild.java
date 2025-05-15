package super_keyword;

public class Super_variablechild extends Super_variableparent
{
String color="blue";
public void display()
{
System.out.println(color);
System.out.println(super.color);
}
	public static void main(String[] args) {
		Super_variablechild objname=new Super_variablechild();
		//System.out.println(objname.color);
	    objname.display();

	}

}
