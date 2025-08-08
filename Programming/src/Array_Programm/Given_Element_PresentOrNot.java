package Array_Programm;

import java.util.Scanner;

public class Given_Element_PresentOrNot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int key=sc.nextInt();
		int count=0;
		
		int a[] = {10,20,30,40,50,60,70};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==key) {
			
				count++;
				break;
			}
		}
		
		if(count>0) {
			System.out.println("Element Found");
		}
		else {
			System.out.println("Element Not Found");
		}
	}

}
