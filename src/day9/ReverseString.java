package day9;

public class ReverseString {
	public static void main(String[] args) {
		
//		reverse the string
		String s = "Welcome";
		String s3 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char s2 = s.charAt(i);
			s3 = s3 + s2;

		}
		System.out.println(s3);

	}

}
