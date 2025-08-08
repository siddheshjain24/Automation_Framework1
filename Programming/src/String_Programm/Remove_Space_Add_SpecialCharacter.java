package String_Programm;

public class Remove_Space_Add_SpecialCharacter {

	public static void main(String[] args) {

		String s = "All the best for exams";
		
		String s1 = "";
		
		for(int i = 0; i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch == ' ') {
				s1 = s1  + '@';
			}
			else {
				s1 = s1 + ch;
			}
		}
		
		System.out.println(s1);
	}

}
