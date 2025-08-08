package String_Programm;

public class LowerCase_To_UpperCase {

	public static void main(String[] args) {

		String s="hello";
		String s1=" ";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch>='a' && ch<='z') {
				s1 = s1+(char)(ch-32);
			}
			else {
				s1 = s1+ch;
			}
		}
		
		System.out.println(s1);
	}

}
