package hacker_rank;
import java.util.*;
import java.io.*;


public class HackerRankDay17 {
	public int power(int n, int p) throws Exception {
		if(n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");	
		}
		
		return (int) Math.pow((double) n,(double) p);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            HackerRankDay17 myCalculator = new HackerRankDay17();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();

	}

}