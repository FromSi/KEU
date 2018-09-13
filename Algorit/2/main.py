import math

y = int(input())
x = int(input())
A = 0
B = 0
c = 0

A = y-math.sqrt(abs(x))
B = x-(y/(x+((x*x)/4)))
c = math.log10(abs(A*B))

print(c)