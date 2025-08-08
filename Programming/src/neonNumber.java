import java.util.Scanner;

public class neonNumber {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      
  
   System.out.println("Enter the no.");
   int n = sc.nextInt();   
   int a = n*n;
   
   int sum = 0;
   
   while (a>0) {
	   int res = n%10;
	   sum = sum + res;
	   a = a/10;
   }
  if (a == sum) {
	  System.out.println("the no is neon");
  }
  else
  {System.out.println("the no is not a neon number");}
	}

}
