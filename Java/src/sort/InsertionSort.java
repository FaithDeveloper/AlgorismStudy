package sort;

import java.util.Arrays;
/**
 * 삽입 정렬 알고리즘.
 * 정렬이 되어 있다는 가정하에 삽입 할 원소를 정렬 규칙에 맞게 삽입 정렬방식.
 * 
 * 문제. 다음의 숫자들을 오름 차순으로 정렬하시오.
 * 1, 10, 9, 3, 4, 6, 2, 5, 8, 7
 * 
 * @author kcs
 * 
 */
public class InsertionSort {
	public static void main(String[] args) {
		function();
	}
	
	public static void function() {
		int i, j, temp;
		int[] array = {1, 10, 9, 3, 4, 6, 2, 5, 8, 7};
		
		for(i = 0; i < array.length - 1; i++) {
			j = i;
			while(array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
