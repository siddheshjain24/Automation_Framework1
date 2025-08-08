package String_Programm;


/* Pass should contains 8-15 character
 * At least one upper case and one lower case character present
 * Should not have space present
 * At least one special character present
 * Should at least one number present
 * */

public class Validate_Password {

	public static void main(String[] args) {

		String s = "Jerry@123";

		int uc=0; int lc=0; int space=0; int numb=0; int sc=0;

		if(s.length()>=8 && s.length()<=15) {

			for(int i=0;i<s.length();i++) {

				char ch = s.charAt(i);

				if(ch>='A' && ch<='Z') {
					uc++;
				}
				else if (ch>='a' && ch<='z') {
					lc++;
				}
				else if (ch == ' ') {
					space++;
				}
				else if (ch>='0' && ch<='9') {
					numb++;
				}
				else {
					sc++;
				}
			}
			if(uc>0 && lc>0 && space==0 && sc>0 && numb>0) {
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Invalid Password");
			}
		}
		else {
			System.out.println("Invalid Password");
		}

	}
}
