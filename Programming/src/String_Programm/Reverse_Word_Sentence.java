package String_Programm;

public class Reverse_Word_Sentence {

	public static void main(String[] args) {

		String s ="all the best for exams";
		
		String s1 = "";
		String str[] = s.split(" ");
		
		for(int i =0;i<str.length;i++) {
			
			String rev = "";
			String snew = str[i];
			
			for(int j = snew.length()-1;j>=0;j--) {
				
				char ch = snew.charAt(j);
				rev = rev + ch;
				
			}
			s1 = s1 + rev + " ";
		}
		System.out.println(s1);
	}
}