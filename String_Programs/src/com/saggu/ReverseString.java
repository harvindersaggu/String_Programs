package com.saggu;


//Input: this is our country
//Output :country our is this
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String input = scanner.nextLine();
		char arr[] = input.toCharArray();
		String output = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			int k = i;
			while (i >= 0 && arr[i] != ' ') {
				i--;
			}
			int j = i + 1;
			while (j <= k) {
				output = output + arr[j];
				j++;
			}
			output = output + " ";
		}
		System.out.println(output);
	}

}
