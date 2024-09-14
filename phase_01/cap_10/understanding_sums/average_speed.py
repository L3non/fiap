# Ask for the distance of the trip
distance = float(input("Please, enter the distance of the trip: "))

# Ask for travel time
time = float(input("Please, enter travel time: "))

# Divide the distance by the time
average_speed = distance / time

# Display the result to the user
print(f"The average speed of your trip was {average_speed:.2f} km/h")