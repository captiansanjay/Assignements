package demo;

public class UnitPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 2, 3, 41, 12, 13, 19, 81, 9 ,42};
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % 10 == i) {
					System.out.print(arr[j]+" ");
				}
			}
		}

	}

}
