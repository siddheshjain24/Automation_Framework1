package Array_Programm;

import java.util.Arrays;

public class Interview_Question {

	public static void main(String[] args) {

		int a[]= {10,20,18,6,1,17,30,22};

		Arrays.sort(a);

		int x=0;
		int y=0;
		int diff=0;
		for(int i=0;i<a.length-1;i++) {

			int sub= a[i]-a[i+1];
			
			if(sub<diff) {
				
				diff=sub;
				x=a[i];
				y=a[i+1];
			}

		}
		
		System.out.println(x+" - "+y+" = "+diff);
	}
}


