package Array_Programm;

public class Sum_Of_EvenNumber {

	public static void main(String[] args) {

		int  a[]= {10,23,46,65,70,34};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of the even number in the array "+sum);
	}

}
