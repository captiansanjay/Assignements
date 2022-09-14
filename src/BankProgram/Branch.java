package BankProgram;

import java.util.Scanner;

public class Branch {

	int branch_id;
	String branch_name;
	String branch_address;

	void branchdetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Branch ID=");
		branch_id = sc.nextInt();
		//System.out.println("Enter Branch Name=");
		branch_name = sc.next();
		//System.out.println("Enter Branch Address=");
		branch_address = sc.nextLine();

	}

	void DisplayBranchDetail() {
		System.out.println("Branch ID=" + branch_id + " " + "Branch Name= " + branch_name + " " + "Branch Address="
				+ branch_address);
	}

}
