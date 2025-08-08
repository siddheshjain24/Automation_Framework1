package String_Programm;

public class String_is_Palindrome_or_Not {

	public static void main(String[] args) {

		String s = "MALAYALAM";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			char ch = s.charAt(i);
			
			rev = rev + ch;
		}
		
		if(s.equals(rev)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
