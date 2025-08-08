import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int n = sc.nextInt();
		int sum =0;

		for (int i=1; i<n; i++) // ["or we can also write (i<=n/2) to 
			                    //reduce the number of Iteration"]
		{
			if(n%i ==0) {
				sum = sum + i;
			} 
		}
		if (sum == n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a perfect Number");
		}
	}

}
