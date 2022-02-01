#!/bin/python3

import os
import sys

#
# Complete the 'utopianTree' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER n as parameter.
#

def utopianTree(n):
    
    for i in range(0, n+1):
        if i == 0:
            h = 1
        elif i == 1:
            h = h + 1
        elif i %2 == 0:
            h = h + 1
        else:
            h = h * 2
    return h

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        result = utopianTree(n)

        fptr.write(str(result) + '\n')

    fptr.close()
