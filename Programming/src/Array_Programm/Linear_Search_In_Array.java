package Array_Programm;
import java.security.PublicKey;
import java.util.Scanner;

public class Linear_Search_In_Array {
	
	public static boolean isElementPresent(int a[],int element) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				return true;
			}
		}
		return false;
	
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");

		int size=sc.nextInt();

		System.out.println("Enter the Element");
		int a[]=new int[size];

		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}

		int element=10;
		System.out.println("Is the Element is present "+isElementPresent(a, element));
	}
}
		
//	    Another Way of doing this 	
//		int key=10;
//		int count=0;
//		
//		for(int i=0;i<a.length;i++) 
//		{
//			if(key==a[i])
//			{
//				count++;
//			}
//		}
//		
//		if(count==1) {
//			System.out.println("Element Found");
//		}
//		else {
//			System.out.println("Element not Found ");
//		}




