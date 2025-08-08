#A service in which people have access to a professional studio to record their videos for YouTube with maximum quality. The service makes money through a subscription system and a bonus calculated as a percentage of the revenue that the client's channel has earned throughout the year.
# Your task is to create an algorithm that receives the type of subscription the client has, their annual revenue, and that calculates and displays the amount of the bonus that the client must pay you. The table below shows the percentage according to each subscription level:

# Level:         Percentage of revenue:
# Basic          30%
# Silver         20%
# Gold           10%
# Platinum       5%

# Receives the type of subscription the client has
sub_type = int(input('TYPE OF SUBSCRIPTION\n1 - BASIC \n2 - SILVER \n3 - GOLD \n4 - PLATINUM \nInform the type of subscription: '))

# Receives their annual revenue
annual_revenue = float(input('Enter the annual revenue: '))

# Calculates and displays the amount of the bonus that the client must pay you
if sub_type == 1:
    percentage = 30
    bonus_calc = 1 - percentage / 100
    bonus_value = annual_revenue - annual_revenue * bonus_calc

    print(f'the amount of the bonus to be paid is: {bonus_value}')

elif sub_type == 2:
    percentage = 20
    bonus_calc = 1 - percentage / 100
    bonus_value = annual_revenue - annual_revenue * bonus_calc

    print(f'the amount of the bonus to be paid is: {bonus_value}')

elif sub_type == 3:
    percentage = 10
    bonus_calc = 1 - percentage / 100
    bonus_value = annual_revenue - annual_revenue * bonus_calc

    print(f'the amount of the bonus to be paid is: {bonus_value}')

elif sub_type == 4:
    percentage = 5
    bonus_calc = 1 - percentage / 100
    bonus_value = annual_revenue - annual_revenue * bonus_calc

    print(f'the amount of the bonus to be paid is: {bonus_value}')

else:
    print('invalid registration type')