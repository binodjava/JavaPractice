package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab790 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("sri");
		list.add("nivas");
		list.add("dande");
		System.out.println(list);
		list.add(1,"java");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list);

	}
}
