tc = int(input('Enter your time at the company: '))
sal = float(input('Enter your salary: '))

if tc < 3:
    increment = sal * 0.05
else:
    increment = sal * 0.1

new_sal = sal + increment
print(f'Your salary wnt from {sal} to {new_sal}')