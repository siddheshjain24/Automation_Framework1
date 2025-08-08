package Array_Programm;

import java.util.Arrays;

public class Merge_Two_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};

		int merge[]= new int[a.length+b.length];
		int n=0;

		for(int i=0;i<a.length;i++) {
			merge[n++]=a[i];
		}

		for(int i=0;i<b.length;i++) {
			merge[n++]=b[i];
		}
		
		System.out.println(Arrays.toString(merge));

	}

}
