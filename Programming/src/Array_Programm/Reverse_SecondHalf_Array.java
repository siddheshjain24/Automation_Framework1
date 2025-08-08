package Array_Programm;

import java.util.Arrays;

public class Reverse_SecondHalf_Array {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60,70};
		
		int i=a.length/2;
		int j=a.length-1;
		
		while(i<j) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
