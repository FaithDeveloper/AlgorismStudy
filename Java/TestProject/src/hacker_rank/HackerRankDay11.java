package hacker_rank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankDay11 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        // 배열 만들
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        // arr[y좌표][x좌표]로 구성됩니다.
        int[] arrSum = new int[16];
        int index = 0;
        // 최소 값은 각 항당 -9 이기에 모두 -9인 경우를 생각하여 -9 * 6 인 -54로 표
        int max = -9 * 6;
        // 각 배열은 x는 3개, y도 3개이기에 최대값은 x + 3, y + 3으로 한다.
        // 1 1 1 
        //   1     
        // 1 1 1 
        for(int y = 0; y < 4; y++) {
	        for(int x = 0; x < 4; x++) {
	        	// 첫 시작 지점부터 x 좌표 최대 3칸, y 좌표 최대 3칸으로 한다.
        		for(int _y = y; _y < y + 3; _y++) {
        			for(int _x = x; _x < x + 3; _x++) {
        				if(_y == y + 1) {
        					if(_x == x + 1) {
        						arrSum[index] += arr[_y][_x];
        					}
        				}else {
        					arrSum[index] += arr[_y][_x];
        				}
        			}
	        	}
        		// 최대값 갱신
        		if(max < arrSum[index]) {
        			max = arrSum[index];
        		}
        		index++;
	        }
        }
        
        System.out.println(String.valueOf(max));
        
        scanner.close();
    }
    
  

}
