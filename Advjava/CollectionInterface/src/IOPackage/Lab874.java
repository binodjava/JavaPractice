package IOPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab874 {
	public static void main(String[] args) throws IOException {

		try {
				FileReader fr= new FileReader("E:\\abc.txt");
				BufferedReader br=new BufferedReader(fr);
				
				FileWriter fw=new FileWriter("E:\\xyz.txt");
				BufferedWriter bwr=new BufferedWriter(fw);
				while(true){
					String st=br.readLine();
					if(st==null)break;
					bwr.write(st);
					bwr.newLine();
				}
			bwr.close();
			System.out.println("writing completed");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
