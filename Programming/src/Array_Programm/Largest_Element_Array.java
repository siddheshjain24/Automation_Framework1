package Array_Programm;


public class Largest_Element_Array {

	public static void main(String[] args) {

		int a[]= {10,30,40,20,50,70,60,5};

		int large=a[0];

		for(int i=1;i<a.length;i++) {

			if(a[i]>large) {
				large = a[i];
			}
		}

		System.out.println("Largest Element in the array is "+large);
	}

}
