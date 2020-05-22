package hacker_rank;
import java.util.*;

public class HackerRankDay10 {
	 private static final Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) {
		  ArrayList<Integer> binary = new ArrayList<Integer>();
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	  while(n > 0) {
	             binary.add(0, n % 2);
	             n /= 2;
	         }
	            
	         int maxCount = 0;
	         int count = 0;
	         for(int i = 0; i< binary.size(); i++) {
	             if(binary.get(i) == 1) {
	                 ++count;
	                 if(maxCount < count) {
	                     maxCount = count;
	                 }
	             }else {
	                 count = 0;
	             }
	         }
	         System.out.println(""+maxCount);
	        scanner.close();
	}

}

