import math

class One:
  def __init__(self, x, y):
    self.x = x
    self.y = y
  def one(self):
    print('one: ', (self.x  + self.y))
  def two(self):
    print('two: ', (self.x - self.y))
  def three(self):
    print('three: ', (self.x / self.y))
  def four(self):
    print('four: ', (self.x * self.y))

class Two:
  def __init__(self, x, y):
    self.x = x
    self.y = y
  def one(self):
    print('one: ', (((self.x ** 3)+(self.y ** 3)) / 2))
  def two(self):
    print('two: ', math.sqrt(abs(self.x)*abs(self.y)))

class Three:
  def __init__(self, x, y):
    self.x = x
    self.y = y
  def one(self):
    print('one: ', self.x * self.y / 2)
  def two(self):
    print('two: ', self.x + self.y + math.sqrt(self.x**2 + self.y**2))

a = int(input())
b = int(input())
    
one = One(a, b)
two = Two(a, b)
three = Three(a, b)

print('\nONE')
one.one()
one.two()
one.three()
one.four()

print('\nTWO')
two.one()
two.two()

print('\nTHREE')
three.one()
three.two()
