package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Lab795 {
	public static void main(String[] args) {

		Vector<String> v= new Vector<String>();
		v.addElement("sri");
		v.addElement("nivas");
		v.addElement("dande");
		v.addElement("sd");
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
	}
}
