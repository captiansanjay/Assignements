package Java8ProgramsStreamApi;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> st = new ArrayList<>();
		st.add(new Student(1, "01/08/22", "12/11/94", "50", "64", "70", "30", "40"));
		st.add(new Student(2, "02/09/22", "12/11/95", "60", "60", "50", "56", "65"));
		st.add(new Student(3, "03/10/22", "12/11/96", "70", "50", "30", "67", "54"));
		st.add(new Student(4, "04/11/22", "12/11/97", "55", "55", "50", "45", "44"));

		/*
		 * List<Float> productPriceList2 = st.stream().filter(p -> p.price > 30000)//
		 * filtering data .map(p -> p.price) // fetching price
		 * .collect(Collectors.toList()); // collecting as list
		 * System.out.println(productPriceList2);
		 */

		//List<String> ls=st.stream().
	}

}
