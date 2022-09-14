package demo;

import java.util.Scanner;

public class StringIndexEnter {

	public static String insertString(String originalString, String stringToBeInserted, int index) {

		StringBuffer newString = new StringBuffer(originalString);

		// Insert the strings to be inserted

		newString.insert(index + 1, stringToBeInserted);
		// newString.append(stringToBeInserted);

		// return the modified String
		return newString.toString();
	}

	public static void main(String[] args) {

		System.out.println("Enter string =");
		Scanner obj1 = new Scanner(System.in);
		String originalString = obj1.nextLine();// 1 st string
		System.out.println("Enter string to be enterd=");
		Scanner obj2 = new Scanner(System.in);
		String stringToBeInserted = obj2.nextLine(); // insrted string

		System.out.println("Enter index=");
		Scanner obj3 = new Scanner(System.in);
		int index = obj3.nextInt();

		System.out.println("Original String: " + originalString);
		System.out.println("String to be inserted: " + stringToBeInserted);
		System.out.println("String to be inserted at index: " + index);

		// Insert the String
		System.out.println("Modified String: " + insertString(originalString, stringToBeInserted, index));
	}
}
