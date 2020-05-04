//
//  QuickSort.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/03.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <stdio.h>

class Quicksort {
  public:
    
    int arr[10] = {1, 10, 9, 3, 4, 6, 2, 5, 8, 7};
    int number = 10;
    
     void start(){
         quick(arr, 0, 10);
      
         for(int i = 0; i < number ; i++) {
             printf("%d\n", arr[i]);
         }
     }
    
    void quick(int* arr, int start, int end){
        if(start >= end){
            return;
        }
        
        int key = start;
        int i = start + 1;
        int j = end;
        int temp;
        
        // 왼쪽부터 키보다 큰수를 찾는다.
        while(i <= end && arr[key] <= arr[i]){
            i++;
        }
        
        // 오른쪽부터 키보다 작은 값을 찾는다.
        while(j > start && arr[key] >= arr[j]){
            j++;
        }
        
        if(i > j){
            // 엇갈린 경우 키 변경
            temp = arr[key];
            arr[key] = arr[j];
            arr[j] = key;
        }else{
            temp =arr[i];
            arr[j] = arr[i];
            arr[j] = arr[i];
        }
        
        // key 가 변경 시 key를 다시 설정
        quick(arr, start, j - 1);
        quick(arr, j + 1, end);
    }
          
};

