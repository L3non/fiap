list = ['a', 2, True, 4.5]
print(list)

list.append(45)
print(list)

list.insert(2, 'FIAP')
print(list)

list.pop()
print(list)

list.clear()
print(list)

list = []
for cont in range(0, 5, 1):
    x = float(input('Enter an element: '))
    list.append(x)
print(list)

for i in range(0, 5, 1):
    print(list[i])

for elem in list:
    print(elem)

sum = 0
for elem in list:
    sum += elem
print(sum)

matrix = [[0, 0], [0, 0], [0, 0], [0, 0]]

print('Filling the matrix...')
for l in range(4):
    for c in range(2):
        matrix[l][c] = int(input(f'Matrix[{l}][{c}] = '))

print('\nDisplaying the matrix...')
for l in range(4):
    for c in range(2):
        print(f'{matrix[l][c]}\t', end = '')
    print()

sum = 0
for l in range(4):
    for c in range(2):
        sum += matrix[l][c]
print(f'\nSum = {sum}')