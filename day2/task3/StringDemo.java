package day2.task3;

public class StringDemo {

	// Basics of String
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		
		boolean a = (s1 == s2);
		boolean b = (s1 == s3);
		boolean c = (s4 == s3);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("-----------------");
		
		boolean d = s3.equals(s4);
		System.out.println(d);
		
		boolean e = s1.equals(s4);
		System.out.println(e);
		
		
	}
}
