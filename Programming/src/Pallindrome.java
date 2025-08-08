import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");

		int n = sc.nextInt();

		int pali = 0;
		int m = n;
		while(n>0) {
			int rem = n%10;
			pali = pali*10 + rem;
			n = n/10;
		}
		if (pali==m)
		{
			System.out.println("the no is pali");
		}
		else {
			System.out.println("the no is not a pali");
		}

	}

}
