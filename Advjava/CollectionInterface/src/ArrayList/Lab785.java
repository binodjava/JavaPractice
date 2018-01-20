package ArrayList;

import java.util.ArrayList;

import java.util.Collection;

public class Lab785 {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("sri");
		col.add("nivas");
		col.add("dande");
		System.out.println(col + "\t" + col.size());

		Collection<String> col2 = new ArrayList<String>();
		col2.add("java");
		col2.add("jdbc");
		col2.add("jsp");
		System.out.println(col2 + "\t" + col2.size());

		col.addAll(col2); // 785 is the solution for lab 784, since we are adding all elements so have to use addAll() methos
		System.out.println(col + "\t" + col2);

	}
}
