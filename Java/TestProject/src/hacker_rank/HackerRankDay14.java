package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	public Difference(int[] a) {
  		this.elements = a;
  	}
  	
  	public void computeDifference() {
  		int max = elements.length;
  		 
  		if(max == 0) {
  	  		//방어 코드
  			return;
  		}else if(max == 1) {
  	  		//방어 코드
  			if(maximumDifference < elements[0]) {
  				maximumDifference = elements[0];
  			}
  			return;
  		}else if (max > 1 && max <= 2) {
  			int difference = Math.abs(elements[0] - elements[1]);
  			if(maximumDifference < difference) {
  				maximumDifference = difference;
  			}
  			return;
  		}
  		for(int i = 0; i< elements.length -1; i++) {
  			for(int j = i+1 ; j < elements.length; j++) {
  				int difference = Math.abs(elements[i] - elements[j]);
  				if(maximumDifference < difference) {
  	  				maximumDifference = difference;
  	  			}
  			}
  		}
  	}

} // End of Difference class

public class HackerRankDay14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}

}
