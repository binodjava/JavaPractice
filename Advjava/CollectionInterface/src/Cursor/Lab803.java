package Cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab803 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("sri");
		list.add("nivas");
		list.add("dande");
		list.add("java");
		list.add("jdbc");
		list.add("jsp");
		ListIterator<String> lit = list.listIterator(2);
		do{
			int indx=lit.nextIndex();
			Object obj=lit.next();
			System.out.println(indx+"\t"+obj);
		}while(lit.hasNext());
		System.out.println();
		lit=list.listIterator(5);
		do{
			int indx=lit.previousIndex();
			Object obj=lit.previous();
			System.out.println(indx+"\t"+obj);
		}while(lit.hasPrevious());
		
		
	}
}
