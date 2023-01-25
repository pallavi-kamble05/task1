package updatedProg;

class validation {
	void Example(int num)throws ArithmeticException{
		if(num<10) {
			throw new ArithmeticException("not valid");
			}
		else {
			System.out.println("valid");
		}
	}

	public static void main(String[] args)throws ArithmeticException {
		validation vd=new validation();
		vd.Example(2);

	}

}
