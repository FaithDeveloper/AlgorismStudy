package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankDay6 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] input = new String[n]; 
		for(int i = 0; i<n; i++) {
			input[i] = scanner.nextLine();
		}
		
		for(int i = 0; i<n; i++) {
			 char[] charArray = input[i].toCharArray();
			 String oddString = "";
			 String evenString = "";
			 for(int j = 0; j < charArray.length; j++) {
				 if(j %2 == 0) {
					 oddString += charArray[j];
				 }else {
					 evenString += charArray[j];
				 }
			 }
			 System.out.println(String.format("%s %s", oddString, evenString));
		}
		scanner.close();
	}

}
