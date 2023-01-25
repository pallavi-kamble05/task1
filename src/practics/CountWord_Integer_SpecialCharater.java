package practics;

public class CountWord_Integer_SpecialCharater {

	public static void main(String[] args) {
	String p= "pali5.kamble@gmail.com";
     char [] result= p.toCharArray();
     
     
     int word=0;
     int Integer=0;
     int SpecialCharater=0;
     
     for (char temp: result) {
    	 if (Character.isAlphabetic(temp))
    	 {
    		 word++;
    	 }
    	 else if(Character.isDigit(temp)) 
    	 
    		 Integer++;
    	 }
    	  
    	 {
    	 SpecialCharater++;	 
    	 }
    	 
    	 System.out.println("Alphabet=  "+word+ "Number=  "+Integer+ "Special Charater=  "+SpecialCharater);
    	 
}
	}


