import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number ==");
		int prm =sc.nextInt();
		
		
		int count = 0;
		
		for(int j=2;j<prm;j++) {
			
		
			for (int i = 2; i <= prm / 2; i++) {
				
				if (prm % i == 0) {
				count++;

				}
			}
			
		
		
		
		if (count == 0 && prm != 1) {
			System.out.println(j + "prime number");

		}
		}
		
//		else {
//			System.out.println(prm + "not primre");
//		}

	}
}
