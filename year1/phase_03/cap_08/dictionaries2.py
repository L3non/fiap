dictionary = {}

# Inserting an element
dictionary['André David'] = 'Academic coordinator'

# Inserting from input
name_collaborator = input('Please, provide the name of the collaborator: ')
position_collaborator = input('Please, provide the position of the collaborator: ')
dictionary[name_collaborator] = position_collaborator


for name, position in dictionary.items():
    print(f'Collaborator {name} works as {position}')

dictionary['André David'] = 'Imperial recruit'

for name, position in dictionary.items():
    print(f'Collaborator {name} works as {position}')