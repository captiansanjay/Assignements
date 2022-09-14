package Java8Programs;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int itemid; String iname; LocalDateTime date_of_manufacturing,
		// date_of_expiry;float price;
		Item it = new Item();
		it.setItemid(12);
		it.setIname("abc");
		LocalDateTime ld = LocalDateTime.now();

		it.setDate_of_manufacturing(ld);
		it.setDate_of_expiry(ld);
		it.setPrice(200);

		System.out.println("itemid=" + it.getItemid() + " " + "iname=" + it.getIname() + " " + "LocalDateTime="
				+ it.date_of_manufacturing);

	}

}
