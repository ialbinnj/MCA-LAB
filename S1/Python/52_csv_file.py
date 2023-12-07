import csv
def write_dict_to_csv(filename, data_dict):
    """Write a Python dictionary to a CSV file.
    :param filename: Name of the CSV file
    :param data_dict: Python dictionary to be written to CSV"""
    with open(filename, 'w', newline='') as csvfile:
        csv_writer = csv.DictWriter(csvfile,fieldnames=data_dict.keys())
        csv_writer.writeheader()
        csv_writer.writerow(data_dict)
        print(f'Dictionary has been written to {filename}')

def read_csv_and_display(filename):
    """Read a CSV file and display its content.
    :param filename: Name of the CSV file"""
    with open(filename, 'r') as csvfile:
        csv_reader = csv.DictReader(csvfile)
        for row in csv_reader:
           print(row)

data_to_write = {'Name': 'John Doe', 'Age': '25', 'City': 'NewYork'}
write_dict_to_csv('example.csv', data_to_write)

print('\nReading and displaying content from CSV:')
read_csv_and_display('example.csv')