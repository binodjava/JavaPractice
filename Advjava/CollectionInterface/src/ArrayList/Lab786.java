package ArrayList;

import java.util.ArrayList;

import java.util.Collection;

public class Lab786 {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("JDBC");
		col.add("JSP");
		col.add("Srinivas");
		col.add("Java");
		col.add("Dande");
		Collection<String> col2 = new ArrayList<String>();
		col2.add("Java");
		col2.add("JDBC");
		col2.add("JSP");
		Collection<String> col3 = new ArrayList<String>();
		col3.add("Java");
		col3.add("JDBC");
		col3.add("EJB");
		System.out.println(col + "\n" + col2 + "\n" + col3);
		System.out.println(col.containsAll(col2)); //true
		System.out.println(col.containsAll(col3)); //false

	}
}
