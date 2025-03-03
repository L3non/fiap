from calculator import *

op = -1

while (op != 5):
    print('1 - Sum two values')
    print('2 - Subtract two values')
    print('3 - Divide two values')
    print('4 - Multiply two values')
    print('5 - Exit')

    op = int(input('Enter your option! '))

    if op == 1:
        print(sumIt(float(input('Enter the first value: ')), float(input('Enter the second value: '))))
    elif op == 2:
        print(subtraction(float(input('Enter the first value: ')), float(input('Enter the second value: '))))
    elif op == 3:
        print(division(float(input('Enter the first value: ')), float(input('Enter the second value: '))))
    elif op == 4:
        print(multiply(float(input('Enter the first value: ')), float(input('Enter the second value: '))))
    elif op == 5:
        print('Leaving!')
    else:
        print('Invalid option')