# Ask the user to enter the employee's name
name = input('Inform the name of the employee: ')

# Ask the user to enter the employee's salary
salary = float(input("inform the employee's salary: "))

# If the salary is negative, alert the user
if salary < 0:
    # salary = salary * -1
    salary = abs(salary)
    print('Attention, a negative salary was reported!')

# Display stored salary
print(f'The employee {name} has a salary of R${salary}')