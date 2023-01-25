package updatedProg;

import java.io.IOException;


class Ex{
	void validate(int age)throws IOException,ArithmeticException,ClassNotFoundException,NullPointerException {
		if(age<20) {
	throw new IOException("not valid") ;
		}
		else {
			System.out.println("valid");
		}
		
	}
}
 class Exeption_handling_example{
	 public static void main(String []agrs)throws IOException,ArithmeticException,ClassNotFoundException,NullPointerException{
		 Ex obj=new Ex();
		 obj.validate(14);
		 
	 }
 }