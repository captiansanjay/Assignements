package demo;

import java.util.Scanner;

public class StringPolidrmCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "madam", "hii", "hello", "SOS" };

		int len = arr.length;

		boolean isPalindrom = true;

		System.out.print("Enter any string : ");
		Scanner in = new Scanner(System.in);

		// Original string
		String origString = in.nextLine();
		//int length = arr.length;

		boolean isPalindrome = true;

		for (int beginIndex = 0; beginIndex < length; beginIndex++) {
			if (arr.charAt(beginIndex) != origString.charAt(length - 1 - beginIndex)) {
				System.out.println("String is not a palindrome.");
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("String is a palindrome.");
		}

	}

}
