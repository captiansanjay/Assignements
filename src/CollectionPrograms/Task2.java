package CollectionPrograms;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int key = 40;

		int result = Arrays.binarySearch(arr, key);

		if (result < 0) {
			System.out.println("no data");
		} else {
			System.out.println("found=" + result);
		}

	}

}
