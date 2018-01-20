package ArrayList;

import java.util.Enumeration;
import java.util.Vector;

public class Lab778 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("Binod");
		v.addElement("Kumar");
		v.addElement("Thakur");
		System.out.println(v);
		Enumeration<String> en = v.elements();
		while (en.hasMoreElements()) {

			String str = en.nextElement();
			System.out.println(str);

		}

	}
}