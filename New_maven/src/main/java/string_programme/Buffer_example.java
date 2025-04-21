package string_programme;

public class Buffer_example {
	public static void main (String args[]) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		StringBuilder sbs=new StringBuilder("world");
		System.out.println(sbs);
		//appent
		System.out.println(sb.append("Good morning"));
		//insert
		System.out.println(sb.insert(17, "nice day"));
		//replace
		System.out.println(sb.replace(3, 6, "good afternoon"));
		//delete
		System.out.println(sb.delete(5, 9));
}
}
 