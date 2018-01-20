package Set;

import java.util.LinkedHashSet;

public class Lab808 {
	public static void main(String[] args) {
	
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		//adding of wrapper object
		set.add(new Long(65));
		set.add(new Byte((byte)65));
		set.add(new Integer(65));
		set.add("a");
		System.out.println(set);

	}
}
