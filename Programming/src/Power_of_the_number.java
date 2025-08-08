import java.util.Scanner;

public class Power_of_the_number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();

		System.out.println("Enter the Power");
		int pow=sc.nextInt();

		int prod=1;

		for(int i=1;i<=pow;i++) {
			prod = prod * n;
		}

		System.out.println(prod);
	}

}
