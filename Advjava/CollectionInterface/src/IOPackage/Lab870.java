package IOPackage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Lab870 {
	public static void main(String[] args) throws IOException {

		try{
			FileInputStream fis=new FileInputStream("E:\\abc.txt");
			BufferedInputStream bis= new BufferedInputStream(fis);
			while(true){
				int asc=bis.read();
				if(asc==-1)break;
				char ch=(char)asc;
				System.out.println(ch);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
