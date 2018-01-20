package IOPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab873 {
	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("E:\\abc.txt");
			FileOutputStream fos=new FileOutputStream("E:\\xyz.txt");
			while (true) {
				int asc = fis.read();
				if (asc==-1)break;
				fos.write(asc);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
