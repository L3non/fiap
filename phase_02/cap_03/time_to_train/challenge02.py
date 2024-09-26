# Observing the early childhood education market, you and your team decide to create an application through which children can learn to control their spending.
# As a way of validating a prototype, you were asked to create a simple script in which the user must inform HOW MANY financial TRANSACTIONS he/she made throughout the day and, then, must inform the VALUE OF EACH of the transactions he/she made.
# At the end, your program must display the total amount spent by the user, as well as the average value of each transaction.

# User must inform HOW MANY financial TRANSACTIONS he/she made throughout the day and, then, must inform the VALUE OF EACH of the transactions he/she made

print("TOTAL TRANSACTIONS VALUE CALCULATOR")
transactions = int(input('How many financial transactions did you make today? '))

i = 0
total_value = 0

for i in range(1, transactions + 1):
    total_value += float(input(f'What is the value of transaction {i}? '))

average = total_value / transactions

# Must display the total amount spent by the user, as well as the average value of each transaction.
print(f'The total amount spent on the {transactions} transactions was: {total_value}. And the average spent per transaction was: {average}')