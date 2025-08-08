package String_Programm;

public class Reverse_Sentence {

	public static void main(String[] args) {

		String s = "I am a Programmer";
		String s1 = "";

		String[] str = s.split(" ");

		for(int i=str.length-1;i>=0;i--) {

			s1 = s1 + str[i] + " ";
		}

		System.out.println(s1);
	}

}
