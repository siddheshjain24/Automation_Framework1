package String_Programm;

public class CountNumberOfDigit_String {

	public static void main(String[] args) {

		String s = "Ash4561";
		
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='0' && ch<='9') {
				count++;
			}
		
		}
		
		System.out.println("Number of digit present in the given string is "+count);
	}

}
