import csv
def create_csv(filename, data):
    """Create a CSV file and write data to it.
    :param filename: Name of the CSV file
    :param data: List of lists representing rows of data"""

    with open(filename, 'w', newline='') as csvfile:
       csv_writer = csv.writer(csvfile)
       csv_writer.writerows(data)
       print(f'Data has been written to {filename}')

def read_specific_columns(filename, columns):
    """Read specific columns from a CSV file and print the content.
    :param filename: Name of the CSV file
    :param columns: List of column indices to be read and printed"""
    with open(filename, 'r') as csvfile:
        csv_reader = csv.reader(csvfile)
        for row in csv_reader:
           selected_data = [row[i] for i in columns]
           print(', '.join(selected_data))

data_to_write = [
['Name', 'Age', 'City'],
['John Doe', '25', 'New York'],
['Jane Smith', '30', 'San Francisco'],
['Bob Johnson', '22', 'Los Angeles']
]
create_csv('example.csv', data_to_write)

print('\nReading specific columns from CSV and printing:')

read_specific_columns('example.csv', [1, 2])
