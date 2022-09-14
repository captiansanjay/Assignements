package Task10Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empid;
		String empname;
		int empsalary;
		String empaddress;
		// Date emp_dob;
		Date emp_dob = null;
		Date emp_doj = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empid=");
		empid = sc.nextInt();
		System.out.println("Enter empname=");
		empname = sc.next();
		System.out.println("Enter empsalary=");
		empsalary = sc.nextInt();
		System.out.println("Enter empaddress=");
		empaddress = sc.next();
		// System.out.println("Enetr emp_dob=");
		// DateFormat formatter = new SimpleDateFormat("EEEE dd MMM yyyy");
		// Date date = formatter.parse(emp_dob);
		// Date date1=null;
		// Scanner input = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter emp_dob (dd/mm/yy):");
		String emp_dob1 = sc.next();
		//System.out.println("emp_dob1=" + emp_dob1);

		if (null != emp_dob1 && emp_dob1.trim().length() > 0) {
			try {

				 emp_dob = format.parse(emp_dob1);
				// emp_doj = format.parse(cinput1);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Enter emp_doj (dd/mm/yy):");
		String emp_doj1 = sc.next();
		//System.out.println("emp_dob1=" + emp_dob1);
		if (null != emp_doj1 && emp_doj1.trim().length() > 0) {
			try {

				 emp_doj = format.parse(emp_doj1);
				// emp_doj = format.parse(cinput1);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("empid=" + empid);
		System.out.println("empname=" + empname);
		System.out.println("empsalary=" + empsalary);
		System.out.println("empaddress=" + empaddress);
		System.out.println("emp_dob=" + emp_dob);
		System.out.println("emp_doj=" + emp_doj);
		//System.out.println("emp_doj=" + emp_doj1);

	}

}
