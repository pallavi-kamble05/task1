package updatedProg;

class practisclass {

	static int a=10;
	static int c=2,d;
	


	public static void main(String[] args) {

		try { // we can not write single try block it will access with catch and finally block
			//we can't not write multiple try as finally block
			int b=a/c;
			System.out.println(b);
			System.exit(0);// jvm will exit the code
		}
		
		catch	(ArithmeticException e){
			e.printStackTrace();
			}
		catch	(Exception e){
			e.printStackTrace();
			}
		
		finally {// here we close all the resources
			
			System.out.println("finally statement");
			if(c==0) {
				
			try {
			System.out.println("ok");
			System.out.println(c/0);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			}
		}
	}

}
