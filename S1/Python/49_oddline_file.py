def write_to_file(file_path, content):
    with open(file_path, 'w') as file:
        file.write(content)

def read_file_to_list(file_path):
    lines = []
    with open(file_path, 'r') as file:
        for line in file:
           lines.append(line.strip())
    return lines

file_path = 'example.txt'

content_to_write = """Line 1: This is the first line.
Line 2: This is the second line.
Line 3: This is the third line."""

write_to_file(file_path, content_to_write)

lines_read = read_file_to_list(file_path)

print("Lines read from the file:")
for line in lines_read:
    print(line)

def copy_and_print_odd_lines(input_file_path,output_file_path):
    odd_lines = []
    with open(input_file_path, 'r') as input_file:
        with open(output_file_path, 'w') as output_file:
            for index, line in enumerate(input_file):
               if index % 2 == 0:
                output_file.write(line)
                odd_lines.append(line.strip())
    print("Odd lines copied to '{}' and theircontents:".format(output_file_path))
    for line_content in odd_lines:
        print(line_content)

input_file_path = 'example.txt'
output_file_path = 'newexample.txt'
copy_and_print_odd_lines(input_file_path, output_file_path)
