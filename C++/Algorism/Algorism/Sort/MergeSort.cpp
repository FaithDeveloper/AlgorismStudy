//
//  MergeAlgorism.cpp
//  Algorism
// 
//
//  Created by 신규찬 on 2020/05/03.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <stdio.h>

class MergeSort {

    int sorted[8];
    int number = 8;

    // 합병
    void merge(int array[], int m, int middle, int n){
        int i = m; // i 는 합병할 항목 중 한 배열의 첫항
        int j = middle + 1; // j는 합병할 항목 한 배열의 마지막 항
        int k = m; // j는 합병할 항목 중 나머지 배열의 첫항

        while(i <= middle && j <= n){
            if(array[i] < array[j]){
                sorted[k] = array[i];
                i++;
            }else{
                sorted[k] = array[j];
                 j++;
            }
            k++;
        }
        
        if(i > middle){
            // 앞의 합병할 항목의 배열 값 모두 들어간 상태
            // 다른 배열의 값은 모두 넣는다.
            for(int t = j; t <= n; t++){
                sorted[k] = array[t];
                t++;
            }
        }else{
            for(int t = i; t<= middle; t++){
                sorted[k] = array[t];
                t++;
            }
        }
        
        // 임시로 저장한 항목을 실제 배열에 넣는다.
        for(int t = m; t <= n; t++){
            array[t] = sorted[t];
        }
    }

    // 분할 및 합병
    void mergeSort(int array[], int m, int n){
        if(m >= n){
            return;
        }
        
        int middle= (m + n) / 2;
        
        mergeSort(array, m, middle);
        mergeSort(array, middle + 1, n);
        merge(array, m, middle, n);
        
    }

public:
    void start(){
        int arr[] = {10, 4, 5, 2, 7, 8, 6 ,9};
        
        mergeSort(arr, 0, number - 1);
        
        for(int i = 0; i < number ; i++) {
            printf("%d\n", arr[i]);
        }
    }
};
