package CollectionPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ProductionFacility {

	// public static void main(String[] args) {

	/*
	 * int pliid; String pro_facility_name; String pro_fa_location; int
	 * totalproduction_perday; // String itemnames[]; String prod_date; Scanner sc =
	 * new Scanner(System.in); System.out.println("enetr pliid="); pliid =
	 * sc.nextInt(); System.out.println("enter pro_facility_name=");
	 * 
	 * pro_facility_name = sc.next(); System.out.println(" enter pro_fa_location=");
	 * pro_fa_location = sc.next(); System.out.println("enter itemnames=");
	 * 
	 * System.out.println("enter the length of String array="); int n =
	 * sc.nextInt(); String[] itemnames = new String[n];
	 * 
	 * for (int i = 0; i < n; i++) { System.out.println("enter the " + (i + 1) +
	 * " String :"); itemnames[i] = sc.next(); }
	 * System.out.println("enyter prod_date="); prod_date = sc.next();
	 * 
	 * System.out.println("pliid=" + pliid); System.out.println("pro_facility_name="
	 * + pro_facility_name); System.out.println("pro_fa_location=" +
	 * pro_fa_location); System.out.println("Strings Entered by user:");
	 * 
	 * for (String s : itemnames) { System.out.println(s); }
	 * System.out.println("prod_date=" + prod_date);
	 */

	int pliid;
	String pro_facility_name;
	String pro_fa_location;
	int totalproduction_perday;
	// String itemnames[] = { "a", "b", "c", "d" };
	String prod_date;

	public ProductionFacility(int pliid, String pro_facility_name, String pro_fa_location, int totalproduction_perday,
			String prod_date) {

		this.pliid = pliid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalproduction_perday = totalproduction_perday;
		// this.itemnames = itemnames;
		this.prod_date = prod_date;
	}

}
