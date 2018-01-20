package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab791 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("sri");
		list.add("nivas");
		list.add("dande");
		list.add("java");
		list.add("nivas");
		list.add("jdbc");
		System.out.println(list);
		int x = list.indexOf("nivas");
		System.out.println(x);
		int y = list.lastIndexOf("nivas");
		System.out.println(y);

	}
}
