package demo;

import java.util.Scanner;

public class VowelsRemoveFromString {
	public static void main(String[] args) {
		
			
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the String: ");
		String str = scan.nextLine();

		String strRes = "";
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char ch = str.charAt(i);
			for (int k = 0; k < vowels.length(); k++) {
				if (ch == vowels.charAt(k))
					count++;
			}
			if (count == 0)
				strRes = strRes + ch;
		}

		System.out.println("\nString without Vowels = " + strRes);
	}
}
