package FileClass;

import java.io.File;
import java.io.IOException;

public class Lab884 {
	public static void main(String[] args) throws IOException {
		File f = new File("e:\\hello.txt");
		f.createNewFile();
		f.deleteOnExit();
		File f2 = new File("hi.txt");
		f2.createNewFile();
		System.out.println("f2.isHidden()\t" + f2.isHidden());
		System.out.println("f2.delete()\t" + f2.delete());
		System.out.println("File Created");
		File f3 = new File("c:\\Documents and Settings\\Default User");
		System.out.println("f3.isHidden()\t" + f3.isHidden());

	}
}
