package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		al.add("abc");
		al.add("xyz");
		al.add("qwe");
		al.add("bb");
		al.add("aa");

		Collections.sort(al);
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
