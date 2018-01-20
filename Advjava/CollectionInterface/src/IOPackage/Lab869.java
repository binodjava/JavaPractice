package IOPackage;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Lab869 {
	public static void main(String[] args) throws IOException {

		System.out.println("Enter data");
		BufferedInputStream bis = new BufferedInputStream(System.in);
		while (true) {
			int asc = bis.read();
			if (asc == 13)break;
			char ch = (char) asc;
			System.out.println(ch);
		}

	}
}
