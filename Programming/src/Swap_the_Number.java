import java.util.Scanner;

public class Swap_the_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int n=sc.nextInt();

		System.out.println("Enter the 2nd Number");
		int m=sc.nextInt();

		int temp=n;
		n=m;
		m=temp;

		System.out.println("After the Swapping");
		
		System.out.println("1st number is "+n);
		System.out.println("2nd number is "+m);
	}
}
