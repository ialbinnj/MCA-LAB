class Time:
      def __init__(self, hour, minute, second):
          self._hour = hour
          self._minute = minute
          self._second = second
      def __add__(self, other):

          # Convert both times to seconds and find the sum

          total_seconds = self._hour * 3600 + self._minute * 60 + self._second + other._hour * 3600 + other._minute * 60 + other._second

          # Calculate the new hour, minute, and second from the total seconds

          new_hour = total_seconds // 3600
          total_seconds %= 3600
          new_minute = total_seconds // 60
          new_second = total_seconds % 60

          # Return a new Time object representing the sum

          return Time(new_hour, new_minute, new_second)
      def display_time(self):
          print(self._hour,":",self._minute,":",self._second)

# Creating two Time objects


time1 = Time(3, 45, 30)
time2 = Time(1, 30, 15)

# Adding two times using the '+' operator

sum_time = time1 + time2

# Displaying the original times and their sum

print("Time 1:")
time1.display_time()
print("\nTime 2:")
time2.display_time()
print("\nSum of Time 1 and Time 2:")
sum_time.display_time()
