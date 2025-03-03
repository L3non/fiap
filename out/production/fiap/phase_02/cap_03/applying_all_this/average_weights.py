# Variable to store the total weight of the boxes
total_weight = 0

# Loop to repeat the weight request 100 times
for x in range(1, 101):
    # For each turn of the loop, request the weight of the box
    current_weight = float(input("Enter the weight of the current box: "))

    # For each weight requested, add to the total weight
    total_weight += current_weight

# At the end of the loop, calculate the arithmetic mean
average = total_weight / 100

# Displaying the results!
print("The total weight of boxes is {}. The average weight is {}".format(total_weight, average))