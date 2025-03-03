option = input('Enter [Y]es or [N]o: ')

while option != 'y' and option != 'Y' and option != 'n' and option != 'N':
    print(f'You typed: {option}, enter Y or N!')
    option = input('Enter [Y]es or [N]o: ')

print(f'You typed: {option}')