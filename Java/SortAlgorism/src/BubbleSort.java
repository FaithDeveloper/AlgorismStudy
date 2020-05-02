import java.util.Arrays;
/**
 *  두 인접한 원소를 검사하여 정렬하는 방법
 *   
 * 문제. 다음의 숫자들을 오름 차순으로 정렬하시오.
 * 1, 10, 9, 3, 4, 6, 2, 5, 8, 7
 * 
 * @author kcs
 */
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{9, 1, 6, 8, 4, 3, -1, 0};
		bubbleSort(arr);
		System.out.print("BubbleSort :" + Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
}


