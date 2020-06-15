package hacker_rank;
import java.io.*;
import java.util.*;


public class HackerRankDay18 {
	// 스택은 선입후출 
	List<Character> statck = new ArrayList<Character>();
	// 큐는 선입선출 
	List<Character> queue = new ArrayList<Character>();
	
	public void pushCharacter(char c) {
		statck.add(c);
	}
	
	public void enqueueCharacter(char c) {
		queue.add(c); 
	}
	
	public Character popCharacter() {
		if(statck == null || statck.size() == 0){
			return null;
		}
		return statck.get(0);
	}
	
	public Character dequeueCharacter() {
		if(queue == null || queue.size() == 0) {
			return null;
		}
			
		int last = queue.size() - 1;
		return queue.get(last);
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        HackerRankDay18 p = new HackerRankDay18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
