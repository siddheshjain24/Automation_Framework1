package String_Programm;

public class Unrepeated_Character_in_String {

	public static void main(String[] args) {

		String s = "Ashish";
		
		char ch[] = s.toCharArray();
		
		boolean b[] = new boolean[ch.length];
		
		for(int i = 0;i<ch.length;i++) {
			
			int count = 0;
			if(b[i] == false) {
				
				for(int j = i+1;j<ch.length;j++) {
					
					if(ch[i] == ch[j]) {
						count++;
						b[j] = true;
					}
				}
				if(count==0) {
					System.out.println("Unrepeated character in the string is "+ch[i]);
				}
			}
		}
	}

}
