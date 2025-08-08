# A major client has been hacked: the server has been hijacked by malicious software that has encrypted all the disks and asks for a password to be entered to unlock the machine. And of course, the criminals demand payment to enter the password.
# When analyzing their program code, however, you discover that the password is composed of the word "LIBERDADE" followed by the factorial of the minutes that the machine is marking at the time the password is entered (if the machine is marking 5 minutes, the password will be LIBERDADE120). Create a program that receives the current minutes from the user and displays on the screen the password needed to unlock it. ATTENTION: your program cannot use ready-made functions to calculate the factorial. It must use a loop.

# Receives the current minutes from the user
minutes = int(input('What are the current minutes? '))

# Displays on the screen the password needed to unlock it
factorial = minutes

for i in range(1, minutes):
    factorial = factorial * i

print(f'The password is "LIBERDADE{factorial}"')