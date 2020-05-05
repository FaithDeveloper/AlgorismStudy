//
//  PareUsingSort.cpp
//  Algorism
//
//  Vector와 Pair 라이브러리를 활용하여 정렬하는 방식
//  Class을 새로 만드는 것보다 간단한 것은 Vector와 Pair 로 구성하면 편하게 활용할 수 있다.
//  Created by 신규찬 on 2020/05/05.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std; //c++ 문법 사용하겠다

class PairUsingSort{
    // 점수 순으로 정렬하고, 만약 점수가 같으면 나이가 어린 사람이 높은 점수 받는 걸로 한다.
    static bool compare(pair<string, pair<int, int>> a,
                 pair<string, pair<int, int>> b){
        if(a.second.first == b.second.first){
            return a.second.second > b.second.second;
        }else{
            return a.second.first > b.second.first;
        }
    }
    
    void sortPair(){
        vector<pair<string, pair<int,int>> > v;
        v.push_back(pair<string, pair<int,int>>("A", pair<int, int>(90,19901225)));
        v.push_back(pair<string, pair<int,int>>("B", pair<int, int>(93,19930423)));
        v.push_back(pair<string, pair<int,int>>("C", pair<int, int>(90,19910315)));
        v.push_back(pair<string, pair<int,int>>("D", pair<int, int>(97,19901122)));
        v.push_back(pair<string, pair<int,int>>("E", pair<int, int>(91,19961122)));
        
        
        sort(v.begin(), v.end(), compare);
        for(int i = 0; i<v.size(); i++){
            cout << v[i].first << ' ';
        };
    }
    
public:
    void start(){
        sortPair();
    }
};
