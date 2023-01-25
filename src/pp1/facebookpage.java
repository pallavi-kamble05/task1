package pp1;

public class facebookpage {
	
	public void createURL()
	{
		System.out.println("https://www.facebook.com");
		
	}
	public void inputdata ()
	{
		System.out.println("FIRST NAME :   ");
		System.out.println("LAST NAME :    ");
		System.out.println("EMAIL ID :     ");
		System.out.println("DATE OF BIRTH :  ");
		System.out.println("PASSWORD :       ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.err.println("facebook page creation steps by step");

facebookpage obj=new facebookpage();
obj.createURL();
obj.inputdata();
	}

}
