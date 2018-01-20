package IOPackage;

import java.io.IOException;

public class Lab868 {
	public static void main(String[] args) throws IOException {
		JlcReader rd = new JlcReader();
		System.out.println("Enter sid");
		String sid = rd.readLine();
		System.out.println("Enter name");
		String nm = rd.readLine();
		System.out.println("Phone number");
		String phn = rd.readLine();
		System.out.println("Enter fee");
		String fee = rd.readLine();
		System.out.println(sid + "\t" + nm + "\t" + phn + "\t" + fee);

	}
}

class JlcReader {
	public String readLine() throws IOException {
		StringBuffer val = new StringBuffer();
		while (true) {
			int asc = System.in.read();
			if (asc == 13);
				 // Ignore 13 ASCII
			else if (asc == 10)
				break;
			else {
				char ch = (char) asc;
				val.append(ch);
			}
		}
		return val.toString();
	}

}