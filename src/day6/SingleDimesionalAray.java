package day6;

public class SingleDimesionalAray {

	public static void main(String[] args) {

//		Declare array and Assign vale
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
//		read single value
		System.out.println("Index at 1st position is = " + a[1]);
		
//		size of array
		System.out.println("size of array = " + a.length);
		
//		read multiple value
		for (int x : a) {
			System.out.println(x);
			
//			approach second- normal for loop
			for (int i=0; i<=a.length-1;i++) {
				System.out.println("Element at " + i + " ="+a[i]);
			}
		}
	}

}
