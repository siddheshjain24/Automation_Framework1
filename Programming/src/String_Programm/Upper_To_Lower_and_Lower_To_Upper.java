package String_Programm;

public class Upper_To_Lower_and_Lower_To_Upper {

	public static void main(String[] args) {

		String s="HELLOhello";
		String s1=" ";
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				s1 = s1+(char)(ch+32);
			}
			else if (ch>='a' && ch<='z') {
				s1 = s1+(char)(ch-32);
			}
			else {
				s1 = s1+ch; 
			}
		}
		
		System.out.println(s1);
	}

}
