package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class Lab781 {
public static void main(String[] args) {
	Collection< String> col=new ArrayList<>();
	col.add("sri");
	col.add("srinivas");
	col.add("sd");
	col.add("dande");
	System.out.println(col.contains("srinivas"));
	System.out.println(col.contains("java"));
	System.out.println(col);
	System.out.println(col.remove("jdbc"));
	System.out.println(col.remove("srinivas"));
	System.out.println(col);
	col.clear();
	System.out.println(col);
	System.out.println(col.size());
	
}
}
