sum = 0

while True:
    num = int(input('Enter a number: '))

    if num >= 0:
        sum = sum + num
    else:
        break
print(f'Soma = {sum}')