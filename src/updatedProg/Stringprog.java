package updatedProg;

public class Stringprog {

	public static void main(String[] args) {

String a="ABCD1234@#$";
String ab=a.replaceAll("[^0-9A-Z]", " "); 

for(int i=ab.length()-1;i>=0;i--) {
	System.out.print(ab.charAt(i));
	
}
//StringBuffer bf= new StringBuffer(ab);
//StringBuffer fb=bf.reverse();
//System.out.println(fb);
	}

}
