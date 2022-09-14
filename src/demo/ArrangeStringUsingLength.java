package demo;

import java.util.Scanner;

public class ArrangeStringUsingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("enter 1st string");
		//Scanner sc = new Scanner(System.in);
		//String str1 = sc.nextLine(); // 1st string
		//System.out.println("enter 2st string");
		//Scanner sc1 = new Scanner(System.in);
		//String str2 = sc1.nextLine(); // 2nd string
		//System.out.println("enter 3st string");
		//Scanner sc3 = new Scanner(System.in);
		//String str3 = sc1.nextLine(); // 3rd string
		String arr[] = { "hi","hello","yes" };
		
		int n=arr.length;   //length calculate
		for (int i=0 ;i<n; i++)
	    {
	        String temp = arr[i];
	 
	        
	        int j = i - 1;
	        while (j >= 0 && temp.length() < arr[j].length())
	        {
	            arr[j+1] = arr[j];
	            j--;
	        }
	        arr[j+1] = temp;
	    }
		
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]);
		}
		
		

		//int str1length = str1.length();
		//int str2length = str2.length();
		//int str3length = str3.length();
		
		}

		//System.out.println(arr);
		// System.out.println(str2);
		// System.out.println(str3);

	}

