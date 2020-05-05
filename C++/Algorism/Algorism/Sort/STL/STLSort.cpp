//
//  STLSort.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/05.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <iostream>
#include <algorithm>

#include "Student.cpp"

using namespace std;

class STLSort {
    
    
public:
    // sort 알고리즘에 compare 조건을 추가로 넣을 수가 있다.
    static bool compare(int a, int b){
        return a > b;
    }
    
    // Test1. compare와 sort 알고리즘으로 정렬하기 해보기
    void compareStart() {
        int a[10] = {9, 3, 5, 4, 1, 10, 8, 6, 7, 2};
        sort(a, a + 10, compare);
        for(int i = 0; i < 10; i++){
        cout << a[i] << ' ';
        }
    }
    
    // Test2. dto의 oprator 을 선언하여 비교 정렬하는 방식
    void start(){
        Student student[] = {
            Student("a", 90),
            Student("b", 86),
            Student("c", 87),
            Student("d", 92),
            Student("e", 87)
        };
         sort(student, student + 5);
         for(int i = 0; i < 5 ; i++){
             cout << student[i].name << ' ';
         }
    }
};
