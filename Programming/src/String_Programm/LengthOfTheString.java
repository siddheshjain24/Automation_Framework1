package String_Programm;

public class LengthOfTheString {

	public static void main(String[] args) {

		String s = "Hello";
		
		char[] ch=s.toCharArray();
		
		int count =0;
		
		for (char c : ch) {
			count++;
		}
		
		System.out.println("Lenth of the array is : "+count);
	}

}
