import csv

def write_to_csv(filename, data):
    """Write data to a CSV file.
    :param filename: Name of the CSV file
    :param data: List of lists representing rows of data
    """
    with open(filename, 'w', newline='') as csvfile:
        csv_writer = csv.writer(csvfile)
        csv_writer.writerows(data)
        print(f'Data has been written to {filename}')

def read_csv_and_print(filename):
    """Read each row from a CSV file and print a list of strings.
    :param filename: Name of the CSV file
    """
    with open(filename, 'r') as csvfile:
        csv_reader = csv.reader(csvfile)
        for row in csv_reader:
            print(', '.join(row))

data_to_write = [
['Name', 'Age', 'City'],
['John Doe', '25', 'New York'],
['Jane Smith', '30', 'San Francisco'],
['Bob Johnson', '22', 'Los Angeles']
]
write_to_csv('example.csv', data_to_write)

print('\nReading from CSV and printing:')
read_csv_and_print('example.csv')
