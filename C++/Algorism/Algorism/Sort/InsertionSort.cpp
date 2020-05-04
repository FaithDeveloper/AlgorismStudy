//
//  InsertionSort.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/03.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <stdio.h>

class InsertionSort {
    public:
    void start(){
        int arr[] = {1, 10, 9, 3, 4, 6, 2, 5, 8, 7};
        int i, j, temp;
        int number = 10;
        
        for(i = 0; i < number - 1; i++){
            j = i;
            while(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
        for(int i = 0; i < number ; i++) {
            printf("%d\n", arr[i]);
        }
    }
};
