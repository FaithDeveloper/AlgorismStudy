//
//  Test.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/08.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

class Test {
public:
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";
    void start(){
       // Declare second integer, double, and String variables.
        int _i;
        double _d;
        string _s;
        // Read and save an integer, double, and String to your variables.
        // Note: If you have trouble reading the entire string, please go back and review the Tutorial closely.
        scanf("%d", &_i);
        scanf("%lf", &_d);
        scanf("%s", &_s);
        // Print the sum of both integer variables on a new line.
        printf("%d\n", i + _i);
        // Print the sum of the double variables on a new line.
        printf("%.f\n", d + _d);
        std::cout << d + _d;
        // Concatenate and print the String variables on a new line
        // The 's' variable above should be printed first.
        s += _s;
        std::cout << s;
    }
};
