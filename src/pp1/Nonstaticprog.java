package pp1;

public class Nonstaticprog {
 //call non static method in static method
public void B1 ()
{
String a= "PALLAVI";
for(int i=a.length()-1;i>0;i--)
	System.err.print(a.charAt(i));
}


//CALL NON STATIC METHOD IN NON STATIC METHOD
public void B2 ()
{
	int pune [] = {10,20,30,40,50,60,70,80};
	
	int mumbai[] = {pune[1],pune[3],pune[5],pune[7]};
	
	for(int a:mumbai)
		System.out.println(a);
	
      B1();
}


//non static method without return type and multiple arguments or parameter
public void B3(int a,int b)
{
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
a++;
System.out.println(a);
a--;
System.out.println(b);
}


//non static method without return type and 1 String arguments/parameter and 1 int 
public void B4 (String a, int b)
{
	System.out.println(a+b);
	}

//Non static method with return type and 0 arguments
public int pqr()
{
	int a=200;
	int b=500;
	int c=a+b;
 return c;
}

//reverse string
public String reverseString()
{
	String a="java";
	String b="";
	for(int i=3;i>=0;i--)
	{
		b=b+a.charAt(i);
	}
	return b;
}







public static void main(String[] args) {
	System.out.println("program is started");
	 Nonstaticprog pk=new  Nonstaticprog();
	 pk.B1();
	 pk.B2();
	 pk.B3(5, 9);
	 pk.B4("JAVA", 45621);
	 int d=pk.pqr();
	 System.out.println(d);
	 System.out.println(pk.reverseString());
}
}