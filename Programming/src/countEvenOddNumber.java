import java.util.Scanner;

public class countEvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.");
		
		int n = sc.nextInt();

		int evencount = 0;
		int oddcount = 0;
		
		while(n>0) {
			int rem = n%10;
	
			if (rem%2 ==0) {
	          evencount++;
			}
			else {
				oddcount++;
			}
			
			n = n/10;
		}
		System.out.println("even no is "+evencount);
		System.out.println("odd no is "+oddcount);
	}

}
