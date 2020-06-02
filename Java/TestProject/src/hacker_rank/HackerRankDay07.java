package hacker_rank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankDay07 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	    int n = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	    int[] arr = new int[n];
	
	    String[] arrItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	    for (int i = 0; i < n; i++) {
	        int arrItem = Integer.parseInt(arrItems[i]);
	        arr[i] = arrItem;
	    }
		
	    scanner.close();
	    
	    // 가운데 index 기준으로 좌우 스위칭한다.
	    int temp = 0;
    	int middle = arr.length / 2;
    	for (int i = 0; i < middle; i++) {
	        temp = arr[i];
	        arr[i] = arr[ arr.length - 1 - i];
	        arr[ arr.length - 1 - i] = temp;
	    }
    	String output = "";
    	 for (int i = 0; i < n; i++) {
 	       if(output.isEmpty()) {
 	    	   output = String.valueOf(arr[i]);
 	       }else {
 	    	  output = output + " " + String.valueOf(arr[i]);
 	       }
 	    }
    	 System.out.println(output);	    

	}

}
