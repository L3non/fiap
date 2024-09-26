i = 1
number = int(input('Please, enter the value for which you want the multiplication table: '))

while i <= 10:
    result = number * i
    print(f'{number} x {i} = {result}')
    i += 1