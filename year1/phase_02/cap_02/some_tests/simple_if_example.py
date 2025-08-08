rm = input('Enter your RM')
age = input('Enter your age')

if int(age) >= 18:
    print('Your participation has been authorized, student of RM {}!'.format(rm))
    print('More information will be sent to your registered email!')
else:
    authorized = input('Do you have authorization from your guardians? Y-YES or N-NO')

    if authorized == 'S':
        print('Your participation has been authorized, student of RM {}!'.format(rm))
        print('More information will be sent to your registered email!')
    else:
        print("Your participation was not authorized because of your age")