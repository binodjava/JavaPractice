package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab811 {
	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(10);
		ts.add(5);
		ts.add(7);
		ts.add(11);
		ts.add(3);
		ts.add(9);
		ts.add(4);
		ts.add(2);
		System.out.println(ts);
		Set<Object> ts1 = ts.descendingSet();
		System.out.println("---Ascending Order----");
		Iterator it = ts.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("Descending order");
		Iterator it1 = ts.descendingIterator();
		while (it1.hasNext())
			System.out.println(it1.next());

	}
}
