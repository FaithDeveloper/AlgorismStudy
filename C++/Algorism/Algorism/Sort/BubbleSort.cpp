//
//  BubbleSort.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/03.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <stdio.h>

class BubbleSort {
public:
    void start(){
        int arr[] = {10, 4, 5, 2, 2, 8, 6 ,9};
        
        int i, j, temp;
        int number = 8;
    
        for(i = 0; i< 8; i++){
            for(j = i + 1; j<number; j++){
                if(arr[i] > arr[j]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                }
            }
        }
        
        
        for(int i = 0; i < number ; i++) {
            printf("%d\n", arr[i]);
        }
    }
};
