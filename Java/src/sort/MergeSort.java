package sort;

import java.util.Arrays;
/**
 * 병합 정렬 또는 합병정렬로 크기가 1인 정렬이 나올 때가지 나눈 후 병합하며 정렬하는 방식입니다
 * 시간 복잡도 O(nLogn)
 * @author kcs
 *
 */
public class MergeSort {
	static int number = 8;
	static int[] sorted = new int[8]; // 정렬 배열은 반드시 전역 변수에 선언 (공통으로 또하나의 공간이 필요하기에)
	
	public static void main(String[] args) {
		int[] array = {7,6,5,8,3,5,9,1};
		mergeSort(array, 0, number - 1);
		System.out.println(Arrays.toString(array));
	}
	
	static void merge(int[] a, int m, int middle, int n) {
		int i = m;
		int j = middle +1 ;
		int k = m;
		//작은 순서대로 배열에 삽
		while(i <= middle && j <= n) {
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			}else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		// 남은 데이터 삽
		if(i > middle) {
			for(int t = j; t <= n; t++) {
				sorted[k] = a[t];
				k++;
			}
		}else {
			for(int t = i; t <= middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		
		// 정렬된 배열을 삽입
		for(int t= m; t <= n; t++) {
			a[t] = sorted[t];
		}
	}
	
	static void mergeSort(int a[], int m, int n) {
		// 크기가 1보다 큰경우
		if(m < n) {
			int middle = (m + n) / 2; 
			mergeSort(a, m, middle);
			mergeSort(a, middle + 1, n);
			merge(a, m, middle, n);
		}
	}
}
