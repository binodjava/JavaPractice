package FileClass;

import java.io.File;
import java.io.FileFilter;

public class Lab879 {
	public static void main(String[] args) {
		File file = new File("E:\\Java Programes");
		File javaFiles[] = file.listFiles(new ExtFilter(".java"));
		System.out.println("java files");
		if (javaFiles != null)
			for (File f : javaFiles)
				System.out.println(f);
		else
			System.out.println("No file found");

	}
}

//It is printing the all  .java files in particular directory called "java programes"

class ExtFilter implements FileFilter{
	String ext;
	public ExtFilter(String ext){
		this.ext=ext;
	}
	public boolean accept(File f){
		return f.getName().endsWith(ext);
	}
}






