import java.util.Arrays;

/**
 * Selection Sort
 * 가장 큰 값을 찾고 가장 끝자리 있는 값과 바꾸는 형태
 * 또는 가장 작은 값을 찾고 정렬되지 않은 앞자리 값과 바꾸는 형태
 * 
 * * 문제. 다음의 숫자들을 오름 차순으로 정렬하시오.
 * 9, 1, 6, 8, 4, 3, -1, 0
 * */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 1, 6, 8, 4, 3, -1, 0};
//		selectionSort(arr);
        selectionSortFromLowValue(arr);
        System.out.print("SelectionSort :" + Arrays.toString(arr));

    }

    // 끝자리 기준 정렬
    public static void selectionSort(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            int max = arr[arr.length - i - 1] ;
            int position = arr.length - i - 1;
            for(int j = 0; j < arr.length - i; j++){
                if(max < arr[j]){
                    max = arr[j];
                    position = j;
                }
            }
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[position];
            arr[position] = temp;
        }
    }

    // 첫 자리 값 기준 정렬
    public static void selectionSortFromLowValue(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            int min = arr[i];
            int position = i;
            for( int j = i; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    position = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[position] = temp;
        }
    }

}
