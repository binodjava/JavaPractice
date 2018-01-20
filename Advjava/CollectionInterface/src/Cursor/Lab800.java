	package Cursor;
	
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	
	public class Lab800 {
		public static void main(String[] args) {
	
			List<String> list = new ArrayList<String>();
			list.add("sri");
			list.add("nivas");
			list.add("dande");
			list.add("java");
			list.add("jdbc");
			list.add("jsp");
			ListIterator<String> it=list.listIterator();
			while(it.hasNext()){
				Object obj=it.next();
			System.out.println(obj);
			}
		}
	}
