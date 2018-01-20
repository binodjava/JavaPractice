package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab792 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("sri");
		list.add("nivas");
		list.add("dande");
		list.add("java");
		list.add("nivas");
		list.add("jdbc");
		List<String> list2=list.subList(1, 3);
		System.out.println(list);
		System.out.println(list2);

	}
}
