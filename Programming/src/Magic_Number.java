import java.util.Scanner;

public class Magic_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");

		int n= sc.nextInt();
		int org=n;
		
		while(n>9) {
			
			int sum = 0;

		        while(n>0) {
				int res=n%10;
				sum= sum+res;
				n=n/10;
			}
		        n=sum;
		}
		
		if(n == 1) {
			System.out.println("Magic");
		}else {
			System.out.println("not a magic");
		}
	}
		

}
