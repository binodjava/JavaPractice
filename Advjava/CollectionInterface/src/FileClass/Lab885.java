package FileClass;

import java.io.File;
import java.io.IOException;

public class Lab885 {
	public static void main(String[] args) throws IOException {
		File f1=new File("sri");
		File f2=new File(f1,"jlc\\io");
		f2.mkdirs();
		System.out.println("directory io inside jlc, and jlc inside sri is created");
		File f3=new File(f2,"hai.txt");
		System.out.println("f3.getName()\t"+f3.getName());
		f3.createNewFile();
		System.out.println("file hi.txt is created sri\\jlc\\io");

	}
}

/*
 * OUTPUT
 * 
 * directory io inside jlc, and jlc inside sri is created
f3.getName()	hai.txt
file hi.txt is created sri\jlc\io
*/
