package demo;

public class DuplicateNumberFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 10, 11, 10, 90, 3, 4, 3, 6, 7, 6 };
		// int count=0;
		int i, j;
		int len = arr.length;
		int count = 0;
		for (i = 0; i < len; i++) {

			for (j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.println(arr[j]+" :"+count);
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					System.out.println("temp"+ temp);
				}

			}
			
		}
		/*
		 * System.out.println(count ); for(int k=0;k<len;k++) {
		 * System.out.println(arr[k]+" :"+count); }
		 */

	}
}
