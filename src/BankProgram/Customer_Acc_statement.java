package BankProgram;

import java.util.Scanner;

public class Customer_Acc_statement {

	int caid;
	int amount;
	int deposit_withdrawl;
	String deposite_date;
	Customer ct;

	void customerAccstatement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Cust Acc Id=");
		caid = sc.nextInt();
		//System.out.println("Enetr amount=");
		amount = sc.nextInt();
		//System.out.println("Enetr deposit_withdrawl=");
		deposit_withdrawl = sc.nextInt();
		//System.out.println("deposite_date=");
		deposite_date = sc.nextLine();

		

		

	}
	void CustAccStateDispaly() {
		System.out.println("Custmoer Account Statement,  Cust ID= " + caid + " " + " Amount=" + amount + " "
				+ "Dposite Withdral=" + deposit_withdrawl + " " + "Deposite Date= " + deposite_date);
	}

}
