package updatedProg;

class a implements Runnable{
	public void run() {
		String str="pallavi";
		char rev;
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev= str.charAt(i);
			System.out.print(str.charAt(i));
			
		}
	}
}



public class Extend_thread {

	public static void main(String[] args) {
	a obj=new a();
	Thread th=new Thread(obj);
	th.start();
	}

}
