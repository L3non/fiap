# Requesting customer data

purchase_value = float(input("Enter the value of the purchase made: "))
coupon = input("Enter the discount coupon: ")

# Performing the logical test with the coupon in capital letters

if coupon.upper() == "NIVER10":
    # 10% discount calculation
    final_value = purchase_value * 0.9
else:
    final_value = purchase_value
    print("INVALID COUPON")

# Displaying the final purchase amount
print("The final purchase value is {}".format(final_value))