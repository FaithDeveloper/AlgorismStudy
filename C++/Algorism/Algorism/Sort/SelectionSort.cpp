//
//  SelectionSort.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/03.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <stdio.h>


class SelectionSort {
public:
    void start(){
        int arr[] = {10, 4, 5, 2, 7, 8, 6 ,9};
        
        int i, j, min, temp, index = 0;
        int number = 8;
    
        for(i = 0; i< 8; i++){
            min = 999;
            for(j = i; j<number; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        
        
        for(int i = 0; i < number ; i++) {
            printf("%d\n", arr[i]);
        }
    }
};
