package FileClass;

import java.io.File;

public class Lab880 {
	public static void main(String[] args) {
		File file = new File("E:\\New folder");
		System.out.println("Dir Found :" + file.exists());//checking whether new folder is there or not
		file.mkdir();  //it will create the new directory name new folder
		System.out.println("Dir Found :" + file.exists()); //checking whether new folder is there or not

	}
}
