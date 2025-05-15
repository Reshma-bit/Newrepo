package collection_example;

import java.util.ArrayList;
import java.util.List;

public class Collection_exam {

	public static void main(String[] args) {
		List< String> obj=new ArrayList <String>();
		// add method used to collection
		obj.add("blue");
		obj.add("red");
		obj.add("yellow");
		obj.add("black");
		System.out.println(obj);
		System.out.println(obj.set(2, "red"));
		System.out.println(obj);//to particular postion new replace the object
		//indexOf
		System.out.println(obj.indexOf("red"));
		//last IndexOf
		System.out.println(obj.lastIndexOf("red"));  
		//contains
		System.out.println(obj.contains("blue"));
		//isEmpty
		System.out.println(obj.isEmpty());
		//get
		System.out.println(obj.get(2));
		//remove there used to delete the message
		System.out.println(obj.remove(1)); 
		System.out.println(obj);
		//size the length
		System.out.println(obj.size());
		for(int i=0;i<3;i++)
		{
			System.out.println(obj.get(i));
		}
		for(String color:obj)
		{
		System.out.println(color);	
		}

	}

}
