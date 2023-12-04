class Publisher:
      def __init__(self, name):
          self.name = name

class Book(Publisher):
      def __init__(self, name, title, author):
          super().__init__(name)
          self.title = title
          self.author = author
      def display_info(self):
          print("Publisher: ",self.name)
          print("Title: ",self.title)
          print("Author: ",self.author)

class Python(Book):
      def __init__(self, name, title, author, price, no_of_pages):
          super().__init__(name, title, author)
          self.price = price
          self.no_of_pages = no_of_pages
      def display_info(self):
          # Method overriding
          super().display_info()
          print("Price: ",self.price)
          print("Number of Pages: ",self.no_of_pages)

# Creating a Python book object
python_book = Python("O'Reilly", "Python Programming", "EricMatthes", 599.99, 560)
# Displaying information about the Python book
python_book.display_info()
