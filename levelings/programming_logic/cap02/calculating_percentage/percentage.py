# - Read the value
value = input('Enter a value: R$ ')
value = float(value)

# - Read the percentage
p = input('Enter a percentage: ')
p = float(p)

# - Calculate the percentage
perc = value * p / 100

# - Calculate the addiction
addi = value + perc

# - Calculate the discount
dis = value - perc

# - Display
print('Percentage: ', perc)
print('Addition: ', addi)
print('Discount: ', dis)