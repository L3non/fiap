sal = float(input('Enter your salary: '))

if sal <= 1900:
    ir = 0

elif sal <= 2800:
    ir = sal * 0.15

else:
    ir = sal * 0.275

net_sal = sal - ir
print(f'IR: {ir:.2f}')
print(f'Net Salary: {net_sal:.2f}')