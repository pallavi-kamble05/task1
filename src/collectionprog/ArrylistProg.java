package collectionprog;

import java.util.ArrayList;

public class ArrylistProg {

	public static <E> void main(String[] args) {
	
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		ar.add(40);//3
		ar.add(50);//4
		ar.add(60);//5
		ar.add(70);//6
		ar.add(80);//7
		ar.add(90);//8
		ar.add(100);//9
		ar.add(110);//10
		ar.add(120);//11
		ar.add(130);//12
		
		System.out.println(ar.size());
		System.out.println("*********");
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(200);
		ar1.add(210);
		ar1.add(220);
		ar1.add(230);
		ar1.add(240);
		ar1.add(250);
		System.out.println(ar1.size());
		
		System.out.println("*********");
		ar.addAll(ar1);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			ArrayList<E> ar2=new ArrayList<E>();
			demoC c1=new demoC("pallavi",20,"QA");
			demoC c2=new demoC("pallavi",20,"QA");
			System.out.println(c1);
			
		}
		
	}

}
