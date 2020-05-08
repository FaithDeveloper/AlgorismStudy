//
//  CoutSort.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/08.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <stdio.h>


class CountingSort {
    int number = 10;
    int countArr[10];
    int arr[10] = {7, 6, 5, 8, 3, 5, 9 ,1, 6, 9};
    
public:
    void start(){
        for(int i = 0; i < 10; i++){
            countArr[i] = 0;
        }
        
        for(int i= 0; i<10; i++){
            countArr[arr[i]]++;
        }
        
        for(int i = 0; i<10; i++){
            if(countArr[i] > 0){
                for(int j = 0; j < countArr[i]; j++){
                 printf("%d\n", i);
                }
            }
        }
    }
};
