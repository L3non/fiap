print("This program inverts the contents of two variables")
A = input("Enter the contents of the variable 1: ")
B = input("Enter the contents of the variable 2: ")
change = A
A = B
B = change
print(f"Now that we have swapped, variable A contains {A} and variable B contains {B}")