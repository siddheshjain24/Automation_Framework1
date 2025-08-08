import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");

		int n=sc.nextInt();
		int sum=0;
		int s=n;

		while(n>0) {

			int res=n%10;
			int fact=1;
			
			for(int i=res;i>=1;i--) 
			{
				fact=fact*i;
			}
			
			sum=sum+fact;
			n=n/10;
		}
		if(s==sum) {
			System.out.println("It is a strong Number");
		}
		else
		{
			System.out.println("It's not a strong Number");
		}

	}}
