package IOPackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab872 {
	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("E:\\abc.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			while (true) {
				String id = br.readLine();
				if (id == null)
					break;
				System.out.println(id);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
