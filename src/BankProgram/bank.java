package BankProgram;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Customer ct = new Customer();
		// Customer_Acc_statement cas = new Customer_Acc_statement();
		Branch b = new Branch();

		Customer c = new Customer();

		Customer_Acc_statement ca = new Customer_Acc_statement();
		b.branchdetails();
		c.custmoerdetails();
		ca.customerAccstatement();
		b.DisplayBranchDetail();
		c.Customerdisplay();
		ca.CustAccStateDispaly();

	}

}
