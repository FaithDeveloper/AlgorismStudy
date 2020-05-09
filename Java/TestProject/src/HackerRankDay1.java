import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankDay1 {

	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int _i = Integer.parseInt(scan.nextLine());
        double _d = Double.parseDouble(scan.nextLine());
        String _s = scan.nextLine();
        
        System.out.println(String.format("%d", i+_i));
        System.out.println(String.format("%.2f", _d + _d));
        System.out.println(String.format("%s%s", s, _s));
        scan.close();
        
        
	}
}
