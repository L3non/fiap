# You must develop an algorithm implemented in Python in which the user informs how many foods he consumed that day and can then inform the number of calories of each of the foods. Since we are not studying lists in this chapter, you should not worry about storing all the calories entered, but you should display the total calories at the end.

# The user informs how many foods he consumed that day and can then inform the number of calories of each of the foods
foods = ''
calories = 0
i = 0

while i != 1:
    print("TOTAL CALORIE CALCULATOR")
    foods = foods + ', ' + input('Enter the food you ate: ')
    calories += int(input('How many calories did this food have? '))
    print("0 - Enter another food")
    print("1 - Display the result")
    i = int(input("Please, inform your option: "))

# You should display the total calories at the end
print(f'Having eaten: {foods}. The total calories ingested were: {calories}')