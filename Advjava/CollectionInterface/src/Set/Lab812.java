package Set;

import java.util.TreeSet;

public class Lab812 {
	public static void main(String[] args) {

		TreeSet<Integer> ts= new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(7);
		ts.add(11);
		ts.add(3);
		ts.add(9);
		ts.add(4);
		ts.add(2);
		System.out.println(ts);
		System.out.println("---subSet()-----");
		System.out.println(ts.subSet(4, 11));
		System.out.println(ts.subSet(4,false,11,true));
		System.out.println(ts.subSet(4,true,11,false));
		System.out.println("---headSet()----");
		System.out.println(ts.headSet(9));
		System.out.println(ts.headSet(9,true));
		System.out.println(ts.headSet(2));
		System.out.println("---tailSet()---");
		System.out.println(ts.tailSet(9));
		System.out.println(ts.tailSet(9,false));
		
		
	}
}
