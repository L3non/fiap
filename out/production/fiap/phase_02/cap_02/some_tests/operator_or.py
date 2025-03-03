# A store offers discounts for purchases paid with a credit card and worth more than RS100

purchase_value = float(input('Please, enter the total purchase amount: '))
payment_method = int(input('PAYMENT METHOD\n1 - CREDIT CARD \n2 - CASH\n Inform the method adopted: '))

if purchase_value > 100 or payment_method == 1:
    purchase_value = purchase_value * 0.9
    print('The customer is entitled to a discount!')

print(f'The purchase value is {purchase_value}')