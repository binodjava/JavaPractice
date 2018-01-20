package IOPackage;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab875 {
	public static void main(String[] args) throws IOException {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter("E:\\xyz.txt", true);
			BufferedWriter bwr = new BufferedWriter(fw);
			char ch = 'Y';
			do {
				System.out.println("Enter id");
				String id = br.readLine();
				System.out.println("Enter name");
				String nm = br.readLine();
				String info = id + "\t" + nm;
				bwr.write(info);
				bwr.newLine();
				System.out.println("Do you want to add more :[Y/N]");
				ch = (char) br.readLine().charAt(0);
			} while (ch == 'Y');
			bwr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
