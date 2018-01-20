package Set;

import java.util.TreeSet;

public class Lab813 {
	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(7);
		ts.add(11);
		ts.add(3);
		ts.add(9);
		ts.add(4);
		ts.add(2);
		System.out.println("--POLL_FIRST---");
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println("***lower()*****");
		System.out.println(ts.lower(8));
		System.out.println(ts.lower(3));
		System.out.println("****higher()*******");
		System.out.println(ts.higher(8));
		System.out.println(ts.higher(50));
		System.out.println(3);
		System.out.println("*****ceiling()*****");
		System.out.println(ts.ceiling(8));
		System.out.println(ts.ceiling(12));
		System.out.println("*****flor()*****");
		System.out.println(ts.floor(8));
		System.out.println(ts.floor(3));

	}
}
