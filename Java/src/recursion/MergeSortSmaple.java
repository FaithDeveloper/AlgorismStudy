package recursion;

import java.util.Arrays;

public class MergeSortSmaple {
	static int number = 8;
	static int[] sorted = new int[8];
	
	public static void main(String[] args) {
		int[] array = {7,6,5,8,3,5,9,1};
		mergeSort(array, 0, number - 1);
		System.out.println(Arrays.toString(array));
	}

	
	
	public static void merge(int[] array, int s, int middle, int n) {
		int i = s;
		int j = middle + 1;
		int k = s;
		
		while(i <= middle && j <= n) {
			if(array[i] < array[j]) {
				sorted[k] = array[i];
				i++;
			}else {
				sorted[k] = array[j];
				j++;
			}
			k++;
		}
		if(i > middle) {
			for(int t = j; t<=n; t++) {
				sorted[k] = array[t];
				k++;
			}
		}else {
			for(int t = i; t<=middle; t++) {
				sorted[k] = array[t];
				k++;
			}
		}
		
		for(int t = s; t<=n; t++) {
			array[t] = sorted[t];
		}
	}
	
	public static void mergeSort(int[] array, int s, int n) {
		if(s >= n) {
			return;
		}
		
		int middle = (s + n) / 2;
		
		mergeSort(array, s, middle);
		System.out.println("=====1====");
		mergeSort(array, middle+1, n);
		System.out.println("=====2====");
		merge(array, s, middle, n);
		System.out.println("=====3====");
	}
}
