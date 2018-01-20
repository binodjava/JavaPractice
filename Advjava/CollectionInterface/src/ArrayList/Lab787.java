package ArrayList;

import java.util.ArrayList;

import java.util.Collection;

public class Lab787 {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("JDBC");
		col.add("sri");
		col.add("JSP");
		col.add("Srinivas");
		col.add("Java");
		col.add("Dande");
		Collection<String> col2 = new ArrayList<String>();
		col2.add("Java");
		col2.add("JDBC");
		col2.add("JSP");
		System.out.println(col);
		System.out.println(col2);
		System.out.println(col.removeAll(col2));
		System.out.println(col);
		System.out.println(col2);

	}
}
