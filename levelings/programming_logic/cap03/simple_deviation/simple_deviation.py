sale = float(input('Enter sale: '))

if sale > 300:
    discount = sale * 10 / 100
    sale = sale - discount

print('New amount = ', sale)