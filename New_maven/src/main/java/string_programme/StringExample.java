package string_programme;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";
System.out.println (s);
String s1=new String("hello");
System.out.println(s);
char ch[]={'A','B','C'};
String b=new String(ch);
System.out.println(b);
//lengthmethod()
System.out.println(s.length());
//concat()
System.out.println(s.concat(s1));
//touppercase()
System.out.println(s.toUpperCase());
//tolowercase()
System.out.println(s.toLowerCase());
String a ="java";
String r="java";
String c="Java";
String e="selenium";
//equals()
System.out.println(a.equals(r));
System.out.println(a.equals(c));
System.out.println(c.equals(e));
//equalignorecase()
System.out.println(a.equalsIgnoreCase(c));
//isempty
String u="";
System.out.println(u.isEmpty());
int a1=10;
String t="";
String f=t.valueOf(a1);
System.out.println(f);
int g=3;
String s2=String.valueOf(g);
System.out.println(s2);
//contains()
String j="my name is reshma";
System.out.println(j.contains("reshma"));
System.out.println(j.contains("have"));
String p=new String("java");
System.out.println(a==r);
System.out.println(a==p);
System.out.println(a.equals(p));
	}
	
	
}
