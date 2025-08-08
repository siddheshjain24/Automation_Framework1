package Array_Programm;

import java.util.Scanner;

public class Nth_Smallest_Element {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60,70};

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of smallest element");
		int n=sc.nextInt();

		for(int i=0;i<a.length;i++) {

			int count = 1;

			for(int j=0;j<a.length;j++) {

				if(a[j]<a[i]) 
				{
					count++;
				}
			}
			if(count==n) {
				System.out.println(n+" smallest element is "+ a[i]);
			}
		}
	}
}

