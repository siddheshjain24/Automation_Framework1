import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No.");

		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");

		for(int i=1;i<=n;i++) {
			int sum = a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}
		
	}
}
