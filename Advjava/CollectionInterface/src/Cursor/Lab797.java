package Cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab797 {
	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();
		Iterator<Object> it = list.iterator();
		if (it.hasNext())
			System.out.println(it.next());
		System.out.println("main completed");

	}
}
