import java.util.Scanner;

public class XylemPholem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");

		int n = sc.nextInt();

		int last = n%10;

		int sum = 0;
		n = n/10;
		while (n>9) {
			int res = n%10;
			sum = res + sum;
			n = n/10;

		}
		int sum1 = n + last;

		if (sum == sum1) {
			System.out.println("the no. is xylem");
		}
		else {
			System.out.println("the no is pholem");
		}
	}

}
