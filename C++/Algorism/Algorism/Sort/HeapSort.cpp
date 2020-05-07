//
//  HeapSort.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/07.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <stdio.h>

class HeapSort{

    int number =9;
    int heap[9] = {7, 6, 5, 8, 3, 5, 9 ,1, 6};

public:
   void start(){
        // 힙 구성
        for(int i=1; i<number; i++){
            int c = i;
            do {
                int root = (c - 1) / 2;
                if(heap[root] < heap[c]){
                    int temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            }while(c != 0);
        }
        // 크기를 줄어가며 반복적으로 힙을 구성
        for (int i = number -1; i >= 0; i--){
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            int root = 0;
            int c = 1;
            do {
                c = 2 * root + 1; // 자식의 왼쪽 값은 루트의 * 2 + 1 이다.
                // 자식 중에서 큰값 찾기
                // 위의 변경된 값보다는 작아야한다.
                // 이미 위에서 힙정렬이 된 상태이기에 자식 노드 중에서 큰 수와 상위 노드를 비교하여도 된다.
                if(c < i  - 1 && heap[c] < heap[c + 1]){
                    c++;
                }
                // 루트보다 자식이 크다면 교환
                if(c < i && heap[root] < heap[c]){
                    temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                root = c;
            } while (c < i);
        }
        for(int i = 0; i < number ; i++) {
             printf("%d\n", heap[i]);
         }
    }
};
