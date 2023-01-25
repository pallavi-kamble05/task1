package uu;

public class SwappingWithout3Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=56;
		int b=53;
		System.out.println("BEFORE SWAPPING : a,b= "+a+","+ +b);
		
		a=a+b;
		System.out.println(a);
		
		b=a-b;
		System.out.println(b);
		
		a=a-b;
		System.out.println(b);
		
		System.out.println("AFTER SWAPPING : a,b ="+a+ "," + +b);
		

	}

}
