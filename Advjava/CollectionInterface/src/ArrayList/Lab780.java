package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class Lab780 {
public static void main(String[] args) {
	Collection<String> col=new ArrayList<>();
	System.out.println(col);
	System.out.println("Size :"+col.size());
	System.out.println("Empty :"+ col.isEmpty());
	System.out.println("======================");
	col.add("sri");
	col.add("nivas");
	col.add("dande");
	System.out.println(col);
	System.out.println("Size :"+col.size());
	System.out.println("Empty :"+ col.isEmpty());
	
	
	
	
}
}
