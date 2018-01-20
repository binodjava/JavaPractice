package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.CORBA.OBJ_ADAPTER;

public class Lab887 {
	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("E:\\info.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student st = new Student(99, "sri", 962190);
			Student.count = 9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Student implements Serializable {
	int sid;
	String name;
	long phone;
	static int count = 3;

	public Student(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		return sid + "\t" + name + "\t" + phone + "\t" + count;
	}
}
