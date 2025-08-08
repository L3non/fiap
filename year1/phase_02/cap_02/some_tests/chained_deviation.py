# Bonus tracks
# > 1000 3 GB
# > 500 1.5 GB
# > 200 500 MB
# < 200 no bonus

points = int(input("Enter the customer's number of points: "))

if points >= 1000:
    print('The customer receives an additional 3 GB!')
elif points >= 500:
    print('The customer receives an additional 1.5 GB!')
elif points >= 200:
    print('The customer receives an additional 500 MB!')
else:
    print('The customer does not receive additional data!')