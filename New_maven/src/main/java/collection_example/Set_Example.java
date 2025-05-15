package collection_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Set_Example {

	public static void main(String[] args) {
		Set <String> s=new HashSet<String>();
		s.add("red");
		s.add("yellow");
		s.add("green");
		s.add("pink");
		s.add("black");
		System.out.println(s);
		
		Set <String> a=new HashSet<String>();
		a.add("add");
		a.add("sub");
		a.add("div");
		a.add("mul");
		a.add("per");
		System.out.println(s);
		a.addAll(a);
		System.out.println(s.contains("green"));
		System.out.println(s.containsAll(a));
		a.remove("add");
		System.out.println(a);
		System.out.println(s.isEmpty());
		s.clear();
		System.out.println(s); 
		System.out.println(s.size());
		
		
		

	}

}
