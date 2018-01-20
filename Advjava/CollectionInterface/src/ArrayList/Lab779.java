package ArrayList;

import java.util.Enumeration;
import java.util.Properties;

public class Lab779 {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("JLC-99", "sri");
		p.put("JLC-88", "nivas");
		p.put("JLC-77", "dande");
		System.out.println(p);
		Enumeration<?> en = p.propertyNames();
		while (en.hasMoreElements()) {
			String pnm = (String) en.nextElement();
			String val = p.getProperty(pnm);
			System.out.println(pnm + "\t\t" + val);

		}
	}
}
