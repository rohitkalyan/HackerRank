#!/bin/python3

import math
import os
import random
import re
import sys

def pickingNumbers(a):
    # Write your code here
    
    count = 0
    maxi = 0
    a.sort()
    
    for i in range(0, len(a)):
        for j in range(i+1, len(a)):
            if(abs(a[i] - a[j]) <= 1):
                count = count + 1
        
        if count > maxi:
            maxi = count
        count = 0
    return maxi+1

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = pickingNumbers(a)

    fptr.write(str(result) + '\n')

    fptr.close()
