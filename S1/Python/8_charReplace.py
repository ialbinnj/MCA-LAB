def replace_first_character(string):
     first_character=string[0]
     rest_of_string=string[1:]
     new_string=first_character+rest_of_string.replace(first_character,'$')
     return new_string
print(replace_first_character("Hi hello happy"))
