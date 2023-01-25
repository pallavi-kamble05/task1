package pp1;

public class Stringprog2 {
	public void eqmethod()// return type method is boolean
	{
	      int a=100;
		  int b=100;
		  System.out.println(a==b);//t
		  System.out.println(a!=b);//f
		
	}
	
	public void equalsignorecase()//it will ignore up & lc
	{
		String a="book";
		String b="hook";
		String c="cook";
		String d="Book";
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase(d));
		
		
	}
	public void andandoperator()//compaire reference value to memory location
	{
		int x=100;
		int y=200;
		int z=200;
		System.out.println(x==y);
		System.out.println(x==z);
		System.out.println(y==z);
		
		
	}
	public void concatmethod ()// return type is string(it is used to combine the string)
	{
		String a="PALLAVI";
		String B="   KAMBLE";
		System.out.println(a.concat(B));
		
		
	}
	public void comparetomethod()// it compair by ASCII
	{
		String a="book";
		String b="Cook";
		System.out.println(a.compareTo(b));
		
	}
	public void arraymethod()// basic array prog
	{
		int abc []=new int[5];
		abc[0]=30;
		abc[1]=90;
		abc[2]=60;
		abc[3]=10;
		abc[4]=20;
		for(int i=0;i<abc.length;i++)
			System.out.println(abc[i]);
		
	}
	public void arrayeqalsignorcase()
	{
		String operator[]=new String[6];
		operator[0]="ARITHMATIC OPERATOR";
		operator[1]="ASSIGN OPERATOR";
		operator[2]="RELATIONAL OPERATOR";
		operator[3]="LOGICAL OPERATOR";
		operator[4]="UNARY OPREATOR";
		operator[5]="BITWISE OPERATOR";
		
		for(int i=0;i<6;i++)
			if (operator[i].equalsIgnoreCase("UNARY OPREATOR"))
				System.out.println("TEST CASE IS PASS");
			System.out.println();
	}
    public void lenghtofarray()
    {
    	String[] man=new String[3];
    	man[0]="office worker";
    	man[1]="someones son";
    	man[2]="someones father";
    	for(String a:man)
    		System.out.println(a);
    }
	public static void main(String[] args) {
		System.out.println("prog started");
		
		Stringprog2 a=new Stringprog2();
        a.eqmethod();
        a.equalsignorecase();
        a.andandoperator();
        a.concatmethod();
        a.comparetomethod();
        a.arraymethod();
        a.arrayeqalsignorcase();
        a.lenghtofarray();
        System.out.println("8 PROGRAME IS ENDED");

	}

}
