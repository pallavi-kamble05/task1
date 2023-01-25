package pp1;

public class Stringprog1 {
	public void age()
	{
		int a=59;
		if((a>0)&&(a<=18))
	System.out.println("person is child");
		
		else if (a>18)
			System.out.println("person is adult");
	}
			
	public void m1()
	{
		String a= "PALLAVI";
		for (int i=a.length()-1; i>=0;i--)
		
			System.out.println(a.charAt(i));
		}
	
	public void star()
	{
		for(int i=1;i<=6;i++){  
			for(int j=6;j>=i;j--){  
			        System.out.print("* ");  
			}  
			System.out.println();  
			}
	
	
	}

	public static void main(String[] args) {
	System.out.println("SOME PROGRAM");
	Stringprog1 cat=new Stringprog1();
	cat.age();
	cat.m1();
	cat.star();
	
	System.out.println("3 prog is comleted");

	}

}
