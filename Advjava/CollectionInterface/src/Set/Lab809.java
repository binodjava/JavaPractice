package Set;

import java.util.LinkedHashSet;

public class Lab809 {
	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		System.out.println(set);

	}
}

class Student {
	int sid;

	Student(int sid) {
		this.sid = sid;
	}

	public String toString() {
		return "" + sid;
	}
}
