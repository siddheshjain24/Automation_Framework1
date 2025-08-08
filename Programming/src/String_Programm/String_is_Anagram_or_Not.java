package String_Programm;

import java.util.Arrays;

public class String_is_Anagram_or_Not {

	public static void main(String[] args) {

		String s = "Silentn";
		String l = "Listen";
		
		if(s.length() == l.length()) {

			s = s.toUpperCase();
			l = l.toUpperCase();
			
			char ch1[] = s.toCharArray();
			char ch2[] = l.toCharArray();
				
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			String s1 = new String(ch1);
			String l1 = new String(ch2);
			
			if(s1.equals(l1)) {
				System.out.println("It is a Anagram");
			}
			else {
				System.out.println("Not a Anagram");
			}
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
