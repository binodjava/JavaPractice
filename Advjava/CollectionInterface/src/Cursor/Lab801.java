package Cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab801 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("sri");
		list.add("nivas");
		list.add("dande");
		list.add("java");
		list.add("jdbc");
		list.add("jsp");
		ListIterator<String> lit = list.listIterator();
		System.out.println(list);
		while (lit.hasNext()) {
			Object obj = lit.next();
			System.out.println(obj);
			if(obj.equals("nivas")) lit.remove();
			else if (obj.equals("java"))
				lit.set("core java");
			else if (obj.equals("jsp"))
				lit.set("servlets");
		}
		System.out.println(list);

	}
}
