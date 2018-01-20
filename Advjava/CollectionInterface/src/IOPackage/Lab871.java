package IOPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab871 {
	public static void main(String[] args) throws IOException {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter id");
			String id = br.readLine();
			System.out.println("Enter name");
			String nm = br.readLine();
			System.out.println(id + "\t" + nm);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
