package uu;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) 35 to 50= pass class
			//	2) 51 to 60 = second class
				//4) 61 to 75 first class
				//5) 75and above  distinction

			//	6)Less than 35 
				//Fail...
 int mrk=61;
 if((mrk>=35)&&(mrk<=50))
 {
	 System.out.println("pass class");
 }
 
 else if ((mrk>=51)&&(mrk<=60))
 {
	 System.out.println("second class");
	
 }
 else if ((mrk>=61)&&(mrk<75))
 {
	 System.out.println("first class");
	 
 }
 if (mrk>=75)
 {
 System.out.println("distinction");
	}
if (mrk<35)
{
	System.out.println("fail");
}
	}

}
