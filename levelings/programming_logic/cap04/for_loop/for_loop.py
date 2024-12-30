num = int(input('Enter 5 numbers: '))
highest = num

for cont in range(1, 5, 1):
    num = int(input())

    if num > highest:
        highest = num
print(f'Highest value = {highest}')