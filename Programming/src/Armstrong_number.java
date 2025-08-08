import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");

		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int count=0;

		while(n>0) {
			count++ ;
			n=n/10 ;
		}

		n = temp;

		while(temp>0) {
			int rem = n%10;
			int prod=1;

			for(int i=1;i<=count;i++) {
				prod = prod * rem;
			}
			sum = sum+prod;
			temp=temp/10;
		}

		if(sum==n) {
			System.out.println("It's a Armstrong Number");
		}

		else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
