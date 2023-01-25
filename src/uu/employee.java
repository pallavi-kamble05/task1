package uu;

public class employee {

	public static void main(String[] args) {
		//basic salary of an employee & calculate its gross salary accourding to following;
//basic salary<=10000:HRA=25%,DA=80%
		//BASIC SALARY <=20000:HRA=25%,DA=90%
		//BASIC SALARY >20000:HRA=30%,DA=95%
		
		float salary=65686f;
		
		if (salary<=10000)
		{
			float HRA=(25/100f*salary);
			float DA=(80/100f*salary);
			float gross = salary+HRA+DA;
			
			
			System.out.println("gross salary : "+gross );
			}
		
		else if ((salary<=10000)&&(salary<=20000))
		{
			float HRA=(25/100f*salary);
			float DA=(900/100f*salary);
			float gross =salary+HRA+DA;
			
			System.out.println("gross salary :"+gross);
			}
		
		
		else if ((salary>20000))
		{
		float HRA=(30/100f*salary);
		float DA=(95/100f*salary);
		float gross =salary+HRA+DA;
		
		System.out.println("gross salary :"+gross);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
