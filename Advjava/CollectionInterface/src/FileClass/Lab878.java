package FileClass;

import java.io.File;

public class Lab878 {
	public static void main(String[] args) {
		File file = new File("E:\\");
		File files[] = file.listFiles();
		for (File f : files) {
			System.out.println(f + " -> isFile :" + f.isFile() + " ,isDir :"
					+ f.isDirectory());
		}

	}
}
