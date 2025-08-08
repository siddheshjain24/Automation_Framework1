import java.util.Scanner;

public class Swap_Number_withoutTemp {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the 1st Number");
		int n=sc.nextInt();

		System.out.println("Enter the 2nd Number");
		int m=sc.nextInt();

		System.out.println("Before Swapping");

		System.out.println("fisrt no is "+n);
		System.out.println("second no is "+m);

		n= n+m;
		m=n-m;
		n=n-m;

		System.out.println("After Swapping");

		System.out.println("first no is "+n);
		System.out.println("second no is "+m);
	}

}
