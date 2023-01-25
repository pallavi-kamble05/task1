package practics;

public class countCvowels {

	public static void main(String[] args) {
		
		
 String vol= "pallavi";
 
 char[] pk=vol.toCharArray();
 
 for(int i=0;i<vol.length();i++) {
	 if(vol.charAt(i)=='a'|| vol.charAt(i)=='e'|| vol.charAt(i)=='i' ||vol.charAt(i)=='o'||vol.charAt(i)=='u')
	 
 System.out.println("String char " +  vol.charAt(i)  +   "At index postion "  + i);
	 System.out.println(vol.codePointCount(0, i));
	}
	}}

