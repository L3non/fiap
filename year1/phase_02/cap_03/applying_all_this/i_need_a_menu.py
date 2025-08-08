# Variable that will be used to receive the user's choice
op = -1

# While the user does not enter the exit option
while op != 4:
    # Displaying menu options
    print("SUPER WONDERFUL PROGRAM")
    print("1 - Run code 1")
    print("2 - Run code 2")
    print("3 - Run code 3")
    print("4 - Exit the program")
    op = int(input("Please, inform your option: "))
    
    # Checking available options
    if op == 1:
        # What will happen if option 1 is selected
        print("CODE 1 RUNNING!")

    elif op == 2:
        # What will happen if option 2 is selected
        print("CODE 2 RUNNING!")

    elif op == 3:
        # What will happen if option 3 is selected
        print("CODE 3 RUNNING!")

# When the loop finishes running, display this message
print("OK! The program is closed...")