package collection_example;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Example {

	public static void main(String[] args)
	{
	
	ArrayList list=new ArrayList <String>();
	list.add("Apple");
	list.add("banana");
	list.add("manago");
	list.add("grapes");
	
		System.out.println(list);
		ArrayList <String> obj=new ArrayList <String>();
		obj.add("blue");
		obj.add("black");
		obj.add("green");
		obj.add("red");
		System.out.println(obj);
		//addAll()combine two add collections
		System.out.println(list.addAll(obj));
		System.out.println(list);
		//containsAll whether the list is check in anthor list
		System.out.println(list.containsAll(obj));
		Iterator <String>i=list.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());	
		}
		i.remove();
		System.out.println(list);
	
		

	}

}
