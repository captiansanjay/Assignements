package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ts = new ArrayList();
		ts.add("aaa");
		ts.add("ccc");
		ts.add("xyz");
		ts.add("ggg");
		ts.add("aaa");
		ts.add("xyz");
		ts.add("ffd");

		TreeSet<String> st = new TreeSet<>(ts);
		Iterator it = st.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
