import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");

		int n = sc.nextInt();

		int prod = 1;
		int sum = 0;

		while(n>0) {
			int res = n%10;
			prod = prod*res;
			sum = sum+res;
			n = n/10;

		}
		if (sum == prod)
		{
			System.out.println("The no. is spy no.");
		}
		else
		{
			System.out.println("The no. is not a spy no.");
		}
	}

}
