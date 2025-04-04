package day7;

public class RepetitionOfNumber {

	public static void main(String[] args) {
		
//		Find how many times number repited
		
		int a[]= {10,20,10,30,20,50,10,30,20,30,60,20,10};
		int b=10;
		int count=0;
		for (int i=0; i<a.length; i++) {
			if (a[i]==b) {
				count++;
			}
		}
		System.out.println(b + " Value repeted by " + count + " Times");

	}

}
