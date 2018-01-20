package Set;

import java.util.LinkedHashSet;

public class Lab805 {
	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		// default natural sorting order
		set.add("sri");
		set.add("nivas");
		set.add("99");
		set.add("dk");
		set.add("manish");
		System.out.println(set);

	}
}
