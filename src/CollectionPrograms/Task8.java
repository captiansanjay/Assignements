package CollectionPrograms;

import java.util.HashMap;
import java.util.Map;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductionFacility p;
		HashMap<Integer, ProductionFacility> mp = new HashMap<>();

		ProductionFacility p1 = new ProductionFacility(1, "as", "pune", 20, "12/12/22");
		ProductionFacility p2 = new ProductionFacility(2, "asd", "pune", 21, "10/12/22");
		ProductionFacility p3 = new ProductionFacility(3, "asf", "pune", 22, "11/12/22");
		ProductionFacility p4 = new ProductionFacility(4, "asg", "pune", 23, "13/12/22");

		mp.put(1, p1);
		mp.put(2, p2);
		mp.put(3, p3);
		mp.put(4, p4);
		for (HashMap.Entry<Integer, ProductionFacility> entry : mp.entrySet()) {
			int key = entry.getKey();
			ProductionFacility b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.pliid + " " + b.pro_facility_name + " " + b.pro_fa_location + " "
					+ b.totalproduction_perday + " " + b.prod_date);

		}
		for (HashMap.Entry<Integer, ProductionFacility> entry : mp.entrySet()) {
			int key = entry.getKey();
			ProductionFacility b = entry.getValue();

			if (b.totalproduction_perday > 22) {
				System.out.println(b.pliid + " " + b.pro_facility_name + " " + b.pro_fa_location + " "
						+ b.totalproduction_perday + " " + b.prod_date);

			}

		}

	}
}
