//
//  Student.cpp
//  Algorism
//  정렬을 활용하기 위해서 사용하는 방식으로 DTO 을 구성한다.
//  operator로 비교 연산을 할 수 있도록 한다.
//
//  Created by 신규찬 on 2020/05/05.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <iostream>
#include <algorithm>

using namespace std;

class Student {
public:
    string name;
    int score;
    Student(string name, int score){
        this->name = name;
        this->score = score;
    }
    
    // 정렬 기준은 '점수가 작은 순서' 로 선언 한다. const 로 선언하여 외부에서도 사용할 수 있도록 선언
    bool operator <(const Student& student) const {
        return this->score < student.score;
    }
    
//    bool operator >(const Student& student) const {
//        return this->score > student.score;
//    }
};
