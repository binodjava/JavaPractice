package Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab816 {

	public static void main(String[] args) {
		System.out.println("***Student info***");
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(new Student(87, "Sri"));
		ts.add(new Student(99, "dande"));
		ts.add(new Student(12, "sd"));
		ts.add(new Student(45, "nivas"));
		Iterator<Object> it = ts.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}

class Student implements Comparable<Object> {
	int sid;
	String name;

	Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Student) {
			Student st = (Student) obj;
			return this.sid - st.sid;
		}
		return 0;
	}

	@Override
	public String toString() {

		return sid + "\t" + name;
	}
}
