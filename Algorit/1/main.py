import math

a = int(input())
b = int(input())
c = int(input())
k = 0
A = 0
B = 0

A = b + math.sqrt((b**2)+(4*a*c))
B = A/(2*a)
k = B-(a**3)*c+(1/(b*b))

print(k)