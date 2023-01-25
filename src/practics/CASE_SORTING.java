package practics;

public class CASE_SORTING {

	public static void main(String[] args) {
		String str="All Is Well";
		int lower =0;
		int UPPAR=0;
		
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>65 && ch<95) {
		UPPAR++;}
		else {
			lower++;
		}
	}
System.out.println("lower case letter : "+lower);
System.out.println("UPPAR case letter : "+UPPAR);
	}

}
