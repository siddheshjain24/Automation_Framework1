package String_Programm;

public class Count_Palindrome_Sentence {

	public static void main(String[] args) {

		String s = "wow it is high level racecar";
		
		String str[] = s.split(" ");
		int count = 0;
		
		for(int i=0;i<str.length;i++) {
			
			String rev = "";
			String s1 = str[i];
			
			for(int j=s1.length()-1;j>=0;j--) {
				
				char ch = s1.charAt(j);
				
				rev = rev +ch;
			}
			if(s1.equals(rev)) {
				count++;
			}
		}
		
		System.out.println("Palindrome in a sentence is "+count);
		
	}

}
