package hacker_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
    	List<Integer> dirNum = new ArrayList<Integer>();
    	for(int i = 1; i <= n; i++) {
    		if(n % i == 0) {
    			dirNum.add(i);
    		}
    	}
    	int sum = 0;
    	for(int i = 0; i<dirNum.size(); i++) {
    		System.out.println(String.format("NUM = %d", dirNum.get(i)));
    		sum += dirNum.get(i);
    	}
        return sum;
    }
}

public class HackerRankDay19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }

}
