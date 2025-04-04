package day6;

public class Practice {

	public static void main(String[] args) {
		
//		find sum of elemnt in array

		int a[]= {1,3,1,2};
		int sum=0;
		for (int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
//		print count of even and odd numers
		
		int b[]= {2,4,3,9,4,1,6,6};
		int even=0;
		int odd=0;
		for (int i=0; i<b.length; i++) {
			if(b[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even numbers= "+even);
		System.out.println("Odd numbers= "+odd);
	}

}
