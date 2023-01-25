package pp1;

public class Methods1 {

	public void kk()
	{
		   int a=100;
			  int b=100;
			  System.out.println(a==b);//t
			  System.out.println(a!=b);//f
			
	}
	public void eqmethod()
	{
		System.out.println("hello world");
	}
	public void dj()
	{
		System.out.println("hello pranali");
	}
	public void pq()
	{
		System.out.println("java");
	}
	

	public static void main(String[] args) {
		System.out.println("call method");
 Methods1 obj=new Methods1();
 obj.eqmethod();
 obj.dj();
 obj.pq();
 obj.kk();
		 System.out.println("end method");

	}

}
