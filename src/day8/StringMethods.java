package day8;

public class StringMethods {

	public static void main(String[] args) {
		
//		Length of string
		String s1="My Name Is Lakhan";
		int length=s1.length();
		System.out.println("length of string = "+length);
		
//		concat of the strings
		String s2="Welcome";
		String s3="To Karachi";
		System.out.println("After concating : " + s2.concat(s3));

//		Trim
		String s4="  Testing  ";
		String s5=s4.trim();
		System.out.println("After trim :" + s5);
		
//		char at
		String s6="Variable";
		char c=s6.charAt(1);
		System.out.println("Char a position 1 :" + c);
		
//		contains string
		String s7="To Test The Subscription Request";
		boolean flag=s7.contains("Req");
		System.out.println("Contains string :" + flag);
		
		String s8="Subscription created successfully to test";
		String s9="created";
		boolean flag2=s8.contains(s9);
		System.out.println("Contains second string :" + flag2);
		
//		equals and equlIgnorCase
		String s10="check";
		String s11="Check";
		System.out.println("equels :" + s10.equals(s11));
		System.out.println("equal ignor case :" + s10.equalsIgnoreCase(s11));
		
		
		
		
		
		
		
	}

}
