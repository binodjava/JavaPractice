package ArrayList;

import java.util.ArrayList;

import java.util.Collection;

public class Lab788 {
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
		System.out.println("col :"+col);
		System.out.println("col2 :"+col2);
		System.out.println("col.retainAll :"+col.retainAll(col2));
		System.out.println("col :"+col);
		System.out.println("col2 :"+col2);
		
		/*
		 * removeAll() returns[subtract new collection elements from first collection elements]
		 * where as retailAll() returns [second collecton elements whihc we try to retain in first collectoin elements]
		*/
		

	}
}
