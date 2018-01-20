package FileClass;

import java.io.File;
import java.io.IOException;

public class Lab883 {
	public static void main(String[] args) throws IOException {
		File[] far=File.listRoots();
		System.out.println(far.length);
		System.out.println("FileName\tis Directory\tisFile\tisAbsolute\tgetPath");
		for(int i=0;i<far.length;i++){
			System.out.println(far[i].getName()+"\t\t"+far[i].isDirectory()+"\t\t"+far[i].isFile()+"\t\t"+far[i].isAbsolute()+"\t\t"+far[i].getPath());
			
		}
		File f=new File(far[1],"hi.txt");
		f.createNewFile();

	}
}

/*OUTPUT
4
FileName	is Directory	isFile	isAbsolute	getPath
		true		false		true		C:\
		false		false		true		D:\
		true		false		true		E:\
		true		false		true		G:\
Exception in thread "main" java.io.IOException: The device is not ready
	at java.io.WinNTFileSystem.createFileExclusively(Native Method)
	at java.io.File.createNewFile(Unknown Source)
	at FileClass.Lab883.main(Lab883.java:16)
*/