package Array_Programm;

public class Occurence_or_Frequency {

	public static void main(String[] args) {

		int a[]= {10,20,30,20,10,40,30,50,10,60};

		boolean b[]=new boolean[a.length];

		for(int i=0;i<a.length;i++) {

			int count=1;

			if(b[i]==false) {

				for(int j=i+1;j<a.length;j++) {

					if(a[i]==a[j]) {

						count++;
						b[j]=true;	
					}
				}
				System.out.println(a[i]+" occured "+count+" Times");
			}
		}
	}

}
