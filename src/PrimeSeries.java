import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the number==");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i = 0;
		int j = 0;
		String primeNum = "";
		for (i = 0; i <= num; i++) {
			int count = 0;
			for (j = i; j >= 1; j--) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				primeNum = primeNum + i + " ";

			}
		}
		System.out.println(primeNum);
		
	}

}
