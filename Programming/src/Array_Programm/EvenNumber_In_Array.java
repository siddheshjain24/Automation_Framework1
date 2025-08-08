package Array_Programm;

public class EvenNumber_In_Array {

	public static void main(String[] args) {

		int[] a= {21,18,72,49,63,96};

		for(int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
				System.out.println("Even no in the array is "+a[i]);
			}
		}
	}

}
