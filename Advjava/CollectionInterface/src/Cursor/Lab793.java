package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Lab793 {
public static <E> void main(String[] args) {
	Vector<E> v=new Vector<>();
	Enumeration<E> en=v.elements();
	System.out.println(en);
	System.out.println(en.nextElement());
	System.out.println("main completed");
}
}
