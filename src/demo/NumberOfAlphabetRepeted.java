package demo;

import java.util.Scanner;

public class NumberOfAlphabetRepeted {
	public static void main(String[] args) {

		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		// Counts each char
		for (int i = 0; i < string.length; i++) {
			int count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}
}
