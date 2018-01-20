package Serialization;

public class Lab889 {
	public static void main(String[] args) throws Exception {
		System.err.println("error message"+"\n");
		System.out.println("out put message");
	}
}





/*package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab889 {
	public static void main(String[] args) throws Exception {
		try {
			FileOutputStream fos = new FileOutputStream("E:\\info.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student st = new Student(99, "sri", 963130);
			Student.count = 9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");

		} catch (Exception e) {

		}

	}

	class Person {
		String name = "XXXXXX";
		long phone = 333333;

	}

	class Student extends Person implements Serializable {
		int sid;
		static int count = 3;

		Student(int sid, String name, long phone) {
			this.sid = sid;
			this.name = name;
			this.phone = phone;
		}

		public String tosString() {
			return sid + "\t" + name + "\t" + phone + "\t" + count;
		}
	}
}
*/




