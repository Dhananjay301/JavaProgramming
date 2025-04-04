package day6;

public class TwoDimenssionalArray {

	public static void main(String[] args) {
	
//		Approach- 1
		
		int a[][]=new int[3][2];   // declare array
		a[0][0]=10;               //assignment
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		//read single value
		System.out.println(a[1][1]);
		
		//size of rows
		System.out.println("No of rows = " + a.length);
		
//		size of coloumn
		System.out.println("No of coloumn= "+ a[1].length);
		
//		Read multiple values
		
		for (int rows=0; rows<=a.length-1; rows++) {
			for (int col=0; col<=a[rows].length-1; col++) {
				System.out.println("index of "+rows + " "+ col + " = "+a[rows][col]);
			}
		}

		
	}

}
