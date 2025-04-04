package day7;

public class SearchingElement {

	public static void main(String[] args) {
		
//		To search element present or not in array
		
		int a[]= {10,20,60,30,50,90};
		int b=201;
		boolean flag=false;
		for (int i=0; i<a.length; i++) {
			if(a[i]==b) {
				System.out.println("Number is present");
				flag=true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Numer is not present");
		}

	}

}
