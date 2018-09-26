class One:                   
    def max(self, x1, x2):
        if(x1 > x2):
            print('1:', x1)
        else: 
            print('1: ', x2)
    def min(self, x1, x2, x3, x4, x5):
        x = x1
        arr = [x1, x2, x3, x4, x5]
        for i in range(4):
            if (x > arr[i + 1]):
                x = arr[i + 1]
        print('1: ', x)
            
    
                  
one = One()

x1 = int(input())
x2 = int(input())
x3 = int(input())
x4 = int(input())
x5 = int(input())

print('\nONE')
one.max(x1, x2)
print('\nTWO')
one.min(x1, x2, x3, x4, x5)