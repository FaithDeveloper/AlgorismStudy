package hacker_rank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankDay8 {
	
	 public static void main(String []argh){
		    HashMap map = new HashMap<String, Integer>();
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            // Write code here
	            map.put(name, phone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            // Write code here
	            Object output = map.get(s);
	            if(output == null) {
	            	System.out.println("Not found");
	            }else {
	            	int phoneNumber = (int) output;
	            	System.out.println(String.format("%s=%d", s, phoneNumber));
	            	
	            }
	            
	            
	        }
	        in.close();
	    }

}
