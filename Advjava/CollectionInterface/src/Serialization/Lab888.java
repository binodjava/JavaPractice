package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Lab888 {
	public static void main(String[] args) throws Exception {

		try {
			FileInputStream fis = new FileInputStream("E:\\info.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			System.out.println(obj);
			System.out.println("Object Deserialized");

		} catch (Exception e) {

		}
	}
}
