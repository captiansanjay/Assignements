package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al = new ArrayList<>();
		al.add("aa");
		al.add("zz");
		al.add("cc");
		al.add("aa");
		al.add("sd");
		al.add("gh");
		al.add("uu");
		al.add("uu");

		System.out.println("before sorting=");
		for (String str : al) {
			System.out.println(str);

		}
		TreeSet<String> ts = new TreeSet<>(al);
		System.out.println("after sorting");
		for (String string : ts) {

			// Collections.reverseOrder();
			System.out.println(string);
			Collections.sort(string, Collections.reverseOrder());
			
			
		}
		
		System.out.println("des=");
		for (String string : al) {
			System.out.println(string);
		}
	}

}
