import math

# Requesting the values ​​of A, B and C
a = float(input("Enter the value of A"))
b = float(input("Enter the value of B"))
c = float(input("Enter the value of C"))

# Delta calculation
delta = b * b - 4 * a * c

# Checking conditions with elif
if delta>0.0:
    # Calculation of 2 values ​​for x
    x1 = (-b + math.sqrt(delta)) / (2 * a)
    x2 = (-b - math.sqrt(delta)) / (2 * a)
    print("For the equation {}x² + {}x + {} = 0, we obtained the following values: x1 = {} and x2 = {}".format(a,b,c,x1,x2))

elif delta == 0:
    # Calculation of 1 value for x
    x = (-b + math.sqrt(delta)) / (2 * a)
    print("For the equation {}x² + {}x + {} = 0, we obtained the following values: x = {}".format(a,b,c,x))

else:
    # Message display
    print("For the equation {}x² + {}x + {} = 0, there are no real values for x".format(a, b, c))