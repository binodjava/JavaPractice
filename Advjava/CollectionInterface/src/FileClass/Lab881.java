package FileClass;

import java.io.File;
import java.io.IOException;

public class Lab881 {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\Lab675.java");
		System.out.println("File Found :" + file.exists());
		file.createNewFile();
		System.out.println("File Found :" + file.exists());

	}
}
