package Cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab798 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("sri");
		list.add("nivas");
		list.add("dande");
		Iterator<String> it = list.iterator();
		int size = list.size();
		// list.remove("sri");
		for (int i = 0; i < size; i++)
			System.out.println(it.next());
		System.out.println("main comoleted");

	}
}
