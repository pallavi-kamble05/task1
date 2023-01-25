package practics;

public class Polidrome {

	public static void main(String[] args) {
		String str="naman";
		String s="";
		
		for(int i=str.length()-1 ;i>=0;i--) {
			s=s+str.charAt(i);}
		if(str.equals(s)) {
			System.out.println("String is polidrome");
		}
		else {System.out.println("String is not polidrome");}
	}

}
