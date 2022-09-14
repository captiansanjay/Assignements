import java.util.Scanner;

public class PerfectNumber {
	
	
	public static void main(String[] args) {

		System.out.println("enter the number==");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int j=1;j<=n;j++) {
			
			int sum=0;
			for(int i=1;i<=j/2;i++) {
			
			if(j%i==0) {
				
				sum=sum+i;
			}
			
			
		}
		if(sum==j) {
			
			System.out.println(j);
		}
		
		}
		
	}

}
