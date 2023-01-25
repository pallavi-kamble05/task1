package practics;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
		Test Data:
		Input first number: 125
		Input second number: 24
		Expected Output :
		125 + 24 = 149
		125 - 24 = 101
		125 x 24 = 3000
		125 / 24 = 5
		125 mod 24 = 5 */

		
		Scanner input=new Scanner (System.in);
		System.out.println("INPUT FIRST NO :  ");
		int a= input.nextInt();
		System.out.println("INPUT SECOND NO : ");
		int b= input.nextInt();
		
		int c=a+b;
		System.out.println("ADDITION : "+c);
		
		int d=a-b;
		System.out.println("SUBSTRATION :  "+d);
		
		int e=a*b;
		System.out.println("MULTIPLICATION :  "+e);
		
		int f=a/b;
		System.out.println("DIVISION :  "+f);
		
		int g=a%b;
		System.out.println("MODULE :  "+g);
		
		
		
	}

}
