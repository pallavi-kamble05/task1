package pp1;

public class Nonstacmethod {

	public void p()
	{
		System.out.println("hello pallavi");
		
	}
	public void s()
	{
		System.out.println("m calling you pallavi");
		p();
		System.out.println("how are you dear");
	
	}
	public void a()
	{
		System.out.println("hello pranali");
		s();
		System.out.println("i am fine");
	}
	public static void main(String[] args) {
		// calling non static method in static
		//non static method to non static method calling ... directly
		//non static method to static method calling..... useing object method
		System.out.println("main method is start");
		Nonstacmethod pk = new Nonstacmethod();
		pk.p();
		pk.s();
		pk.a();
		
		System.out.println("main method is ended");
	

	}

}
