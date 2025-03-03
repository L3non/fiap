# A large gaming company wants to make its games more challenging. That's why it hired you to develop an algorithm that will be applied in several other games in the future: the Fibonacci luck algorithm.
# The idea of ​​this company, of course, is to make it harder for players to succeed in the actions they perform in games. That's why its algorithm should work as follows: the user must enter an integer numeric value and the algorithm must check whether this value is in the Fibonacci sequence. If the number is in the sequence, the algorithm should display the message "Action successful!", and if it is not, it should display the message "Action failed...".
# The Fibonacci sequence is very simple and has an easy-to-understand logic: it starts at 1 and each new element in the sequence is the sum of the two previous elements. Therefore: 1, 1, 2, 3, 5, 8, 13, 21, and so on.
# Therefore, if the user types the number 55, the program should inform that the action was successful, after all 55 is among the numbers in the sequence.
# But, if the user types the number 6, for example, the action will not be successful, as the number 6 is not in the sequence.

n = int(input('Enter a number: '))

previous1 = 1
previous2 = 0

for i in range(n + 1):
    actual = previous1 + previous2
    previous1 = previous2
    previous2 = actual

    if n == actual:
        print('Action successful!')
        break
    elif n < actual:
        print('Action failed...')
        break