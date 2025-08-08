package Array_Programm;

public class Duplicate_Element {

	public static void main(String[] args) {

		int a[]= {10,10,30,40,50,30,40,60,20};
		
		boolean b[] = new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			
			if(b[i]==false) {
				
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count>0) {
					System.out.print(a[i]+" ");
					}	
			
			}
		}
	}

}
