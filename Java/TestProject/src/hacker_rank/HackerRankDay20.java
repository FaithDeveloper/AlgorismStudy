package hacker_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankDay20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int temp = 0;
        int count = 0;
        for(int i = 0; i<a.length ; i++) {
        	for(int j = 0; j < a.length - 1; j++) {
        		if(a[j] > a[j+1]) {
        			temp = a[j];
        			a[j] = a[j+1];
        			a[j+1] = temp;
        			count++;
        		}
        	}
        }
        System.out.println(String.format("Array is sorted in %d swaps.", count));
        System.out.println(String.format("First Element: %d", a[0]));
        System.out.println(String.format("Last Element: %d", a.length == 0 ? 0 : a[a.length-1]));
        
	}

}
