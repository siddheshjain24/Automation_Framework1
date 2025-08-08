package Array_Programm;

import java.util.Arrays;

public class Reverse_Arrays_casually {

	public static void main(String[] args) {

		char []ch= {'a','b','c','d','e','f','g','h'};
		
		int i=0;
		int j=ch.length/2;
		
		while(i<ch.length/2) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j++;
		}
		
		System.out.println(Arrays.toString(ch));
	}

}
