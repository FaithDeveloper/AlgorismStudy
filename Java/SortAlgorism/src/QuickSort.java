import java.util.Arrays;
/**
 * 퀵 정렬 알고리즘.
 * 피벗을 기준으로 정렬 조건을 만들고 피벗이 변경 시 피벗 기준으로 다시 정렬을 하게 되어 있다.
 * 
 * 문제. 다음의 숫자들을 오름 차순으로 정렬하시오.
 * 1, 10, 9, 3, 4, 6, 2, 5, 8, 7
 * 
 * @author kcs
 */
public class QuickSort {
	
	static void quick(int[] data, int start, int end) {
		if(start >= end) {
			// 원소가 1개 일 경우
			return;
		}
		
		int key = start;
		int i = key + 1; // 왼쪽부터 큰 수 찾기 위한 index
		int j = end; // 오른쪽부터 작은 수 찾기 위한 index
		int temp;
		
		while(i <= j) {
			// 엇갈릴 때까지 계속 진행
			while(i <= end && data[i] <= data[key]) {
				// 왼쪽부터 피벗보다 큰 수 찾기
				i++;
			}
			while(j > start && data[j] >= data[key]) {
				//오른쪽부터 피벗보다 작은 수 찾기
				j--;
			}
			
			if(i > j) {
				// 엇갈린 경우
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			}else {
				// 엇갈리지 않은 경우
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
		quick(data, start, j-1);
		quick(data, j + 1, end);
		
	}
	
	public static void main(String[] args) {
		int[] array = {1, 10, 9, 3, 4, 6, 2, 5, 8, 7};
		quick(array, 0, array.length - 1);
		
		System.out.println(Arrays.toString(array));
	}
}
