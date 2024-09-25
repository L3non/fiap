# A travel agency is proposing a strategy to boost sales after the impacts of the coronavirus pandemic.
# The company will offer progressive discounts on package purchases, depending on the number of travelers who are in the same group and live in the same household.
# To help make this project a reality, you must create an algorithm that receives the GROSS VALUE of the package, the SEAT CATEGORY on the flight and the NUMBER OF TRAVELERS who live in the same household and calculates the discounts according to the table:

# Economic category:            # Executive category:            # First class category:
# 2 travelers = 3%              # 2 travelers = 5%               # 2 travelers = 10%
# 3 travelers = 4%              # 3 travelers = 7%               # 3 travelers = 15%
# 4 travelers or more = 5%      # 4 travelers or more = 8%       # 4 travelers or more = 20%

# The program should display the GROSS VALUE OF THE TRIP (gross value minus discounts) and the AVERAGE VALUE PER TRAVELER.

# Receives the GROSS VALUE of the package
gross_value = float(input('Enter the gross value of the package: '))

# Receives the SEAT CATEGORY on the flight
seat_category = int(input('SEAT CATEGORY\n1 - ECONOMIC \n2 - EXECUTIVE \n3 - FIRST CLASS \nInform the seat category: '))

# Receives the NUMBER OF TRAVELERS who live in the same household
travelers_number = int(input('Enter the number of travelers living in the same residence: '))

# Calculates the discounts according to the table
if seat_category == 1:
    if travelers_number == 1:
        print(f'The gross value value of the package is: {gross_value}')
        print('There is no discount on this seat category for this number of travelers!')
        print(f'The net value of the package is: {gross_value}')
        print(f'The average value per traveler is {gross_value / travelers_number}')

    elif travelers_number == 2:
        discount = 3
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')
    
    elif travelers_number == 3:
        discount = 4
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')

    elif travelers_number >= 4:
        discount = 5
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')

    else:
        print('Number of travelers invalid!')

elif seat_category == 2:
    if travelers_number == 1:
        print(f'The gross value value of the package is: {gross_value}')
        print('There is no discount on this seat category for this number of travelers!')
        print(f'The net value of the package is: {gross_value}')
        print(f'The average value per traveler is {gross_value / travelers_number}')

    elif travelers_number == 2:
        discount = 5
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')
    
    elif travelers_number == 3:
        discount = 7
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')

    elif travelers_number >= 4:
        discount = 8
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')

    else:
        print('Number of travelers invalid!')

elif seat_category == 3:
    if travelers_number == 1:
        print(f'The gross value value of the package is: {gross_value}')
        print('There is no discount on this seat category for this number of travelers!')
        print(f'The net value of the package is: {gross_value}')
        print(f'The average value per traveler is {gross_value / travelers_number}')

    elif travelers_number == 2:
        discount = 10
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')
    
    elif travelers_number == 3:
        discount = 15
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')

    elif travelers_number >= 4:
        discount = 20
        discount_calc = 1 - discount / 100
        discount_value = gross_value - gross_value * discount_calc
        net_value = gross_value * discount_calc
        average = net_value / travelers_number

        print(f'The gross value value of the package is: {gross_value}')
        print(f'The discount for this seat category for this number of travelers is {discount_value} ({discount}%)')
        print(f'The net value of the package is: {net_value}')
        print(f'The average value per traveler is {average}')

    else:
        print('Number of travelers invalid!')

else:
    print('Invalid seat category!')