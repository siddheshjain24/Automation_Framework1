package Array_Programm;

import java.util.Scanner;

public class UserInput_PrintElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of the array");

		int size=sc.nextInt();

		int[] a= new int[size];

		System.out.println("Enter the element");

		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}

		System.out.println("After entering the element");
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
	}

}
