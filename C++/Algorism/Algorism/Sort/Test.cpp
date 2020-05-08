//
//  Test.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/08.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <stdio.h>

class Test {
public:
    int countArray[10001];
    
    void start(){
        int count;
        scanf("%d", &count);
        
        for(int i = 0; i<10001;i++){
            countArray[i] = 0;
        }
        
        for(int i = 0; i < count; i++){
            int data;
            scanf("%d", &data);
            countArray[data]++;
        }
        
        for(int i= 0; i<10001; i++){
//            if(countArray[i] > 0){
                for(int j = 0; j < countArray[i]; j++){
                    printf("%d\n", i);
                }
//            }
        }
    }
};
