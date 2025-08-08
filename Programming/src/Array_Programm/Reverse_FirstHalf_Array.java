package Array_Programm;

import java.util.Arrays;

public class Reverse_FirstHalf_Array {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60,70};
		
		int i=0;
		int j=a.length/2;
		
		while(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
//		for (int k=0;k<a.length;k++) {
//			System.out.print(a[k]+" ");
//		}
	     
		System.out.println(Arrays.toString(a));
	}

}
