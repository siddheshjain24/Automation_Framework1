package Array_Programm;

public class Smallest_Element_Array {

	public static void main(String[] args) {

		int a[]= {10,30,40,20,4,3,70,1};

		int small=a[0];

		for(int i=1;i<a.length;i++) {

			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println("Smallest element in the array is "+small);
	}

}
