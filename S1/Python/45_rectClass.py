class Rectangle:
      def __init__(self, length, width):
          self._length = length
          self._width = width
      def area(self):
          return self._length * self._width
      def __lt__(self, other):
          return self.area() < other.area()
          
# Creating two Rectangle objects
rectangle1 = Rectangle(5, 10)
rectangle2 = Rectangle(8, 6)

# Comparing rectangles based on area using the '<' operator
if rectangle1 < rectangle2:
   print("Rectangle 1 has a smaller area than Rectangle 2.")
elif rectangle1 > rectangle2:
   print("Rectangle 1 has a larger area than Rectangle 2.")
else:
   print("Both rectangles have the same area.")
