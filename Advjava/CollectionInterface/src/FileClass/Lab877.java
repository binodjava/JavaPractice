package FileClass;

import java.io.File;

public class Lab877 {
	public static void main(String[] args) {
		File drives[] = File.listRoots();
		for (File f : drives) {
			long total = f.getTotalSpace();
			total = total / 1024 / 1024 / 1024;
			long usable = f.getUsableSpace();
			usable = usable / 1024 / 1024 / 1024;
			System.out.println(f + "\t\t\t" + total + "GB\t\t" + usable + "GB");
		}

	}
}
