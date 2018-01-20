package ArrayList;

import java.util.ArrayList;

import java.util.Collection;

public class Lab782 {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("sri");
		col.add("nivas");
		col.add("dande");
		System.out.println(col);
		Object arr[] = col.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i] = "JLC";

		}
		System.out.println(col);
		/*
		 * System.out.println("Using for each loop"); 
		 * for (Object str:arr)
		 * System.out.println(str);
		 */

	}
}
