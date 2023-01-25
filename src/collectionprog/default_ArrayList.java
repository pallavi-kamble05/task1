package collectionprog;

import java.util.ArrayList;

public class default_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ls=new ArrayList<>(5);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		ls.add(8);
		ls.add(9);
		ls.add(10);
		ls.add(11);
		System.out.println(ls.size());
		ls.remove(7);
		System.out.println(ls.size());
		ls.containsAll(ls);
		System.out.println(ls.size());
		ls.isEmpty();
		System.out.println(ls.size());
		ls.ensureCapacity(15);
		System.out.println(ls.size());
		ls.removeAll(ls);
		System.out.println(ls.size());
		

	}

}
