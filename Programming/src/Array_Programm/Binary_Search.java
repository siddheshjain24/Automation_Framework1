package Array_Programm;

import java.util.Arrays;
public class Binary_Search {

	public static void main(String[] args) {

		int a[]= {50,80,40,33,72,95,65,100,25,17};

		int count=0;
		int key=110;
		int low=0;
		int high=a.length-1;

		Arrays.sort(a);

		for(int i=0;i<a.length;i++) {

			int mid=(high+low)/2;

			if(key==a[mid]) {
				count++;
				break;
			}
			else if (key>a[mid]) {
				low=mid+1;
			}
			else if(key<a[mid]) {
				low=mid-1;
			}

		}

		if(count>0) {
			System.out.println("Element Found");
		}
		else {
			System.out.println("Element Not Found");
		}
	}

}
