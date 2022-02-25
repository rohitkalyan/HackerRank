#!/bin/python3

import math
import os
import random
import re
import sys

def permutationEquation(p):
    arr = []
    for i in range(1, len(p) + 1):
        index1 = p.index(i) + 1
        index2 = p.index(index1) + 1
        arr.append(index2)
    return arr

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    p = list(map(int, input().rstrip().split()))

    result = permutationEquation(p)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
