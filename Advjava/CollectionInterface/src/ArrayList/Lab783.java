package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab783 {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("sri");
		col.add("nivas");
		col.add("dande");
		System.out.println(col);
		Iterator<String> it = col.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			if (obj.equals("sri"))
				it.remove();

		}
		System.out.println(col);

	}
}
