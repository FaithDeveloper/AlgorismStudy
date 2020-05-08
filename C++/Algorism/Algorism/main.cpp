//
//  main.cpp
//  Algorism
//
//  Created by 신규찬 on 2020/05/02.
//  Copyright © 2020 신규찬. All rights reserved.
//

#include <iostream>
#include <algorithm>


#include <stdio.h>
#include "Sort/Test.cpp"
#include "Sort/MergeSort.cpp"
#include "Sort/SelectionSort.cpp"
#include "Sort/BubbleSort.cpp"
#include "Sort/InsertionSort.cpp"
#include "Sort/QuickSort.cpp"
#include "Sort/STL/STLSort.cpp"
#include "Sort/STL/PairUsingSort.cpp"
#include "Sort/HeapSort.cpp"
#include "Sort/CountingSort.cpp"

int main(int argc, const char * argv[]) {
    
    CountingSort m = CountingSort();
    m.start();
    
    return 0;
}
