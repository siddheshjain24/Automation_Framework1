import java.util.Scanner;

public class Product {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");

		int n = sc.nextInt();

		int product = 1;
		while (n>0) {
			int res = n%10;
			product = product * res;
			n = n/10;
		}
		System.out.println("the product of the no is "+ product);
	}
}
