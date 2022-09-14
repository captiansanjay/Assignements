package CollectionPrograms;

import java.util.Collections;
import java.util.Vector;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>();
		v.add("a");
		v.add("z");
		v.add("d");
		v.add("e");
		v.add("q");

		System.out.println("before sorting");
		for (String string : v) {

			System.out.println(string);
		}

		Collections.sort(v);
		System.out.println("after sorting");
		for (String string : v) {
			System.out.println(string);
		}
	}

}
