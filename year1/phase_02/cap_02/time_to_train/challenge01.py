# Check if the heart rate is within the appropriate range. To do this, you must ask the user to enter their BEATS PER MINUTE (BPM) and AGE. From there, the script must check and display a message informing whether the user's heart rate is WITHIN the appropriate range, ABOVE the appropriate range or BELOW the appropriate range.

#  >= 2 years = 120 - 140
#  <= 8 and >= 17 = 80 - 100
#  <= 18 and >= 49 = 70 - 80
#  <= 50 = 50 - 60

# Ask the user to enter their BEATS PER MINUTE (BPM)
bpm = int(input('Enter your BPM: '))

# Ask the user to enter their AGE
age = int(input('Enter your age: '))

# Check and display a message informing whether the user's heart rate is WITHIN the appropriate range, ABOVE the appropriate range or BELOW the appropriate range.
if age <= 2:
    if bpm < 120:
        print('Beats per minute are below the appropriate range')
    elif bpm <= 140:
        print('Beats per minute are within the appropriate range')
    else:
        print('Beats per minute are above the appropriate range')

elif age >= 8 and age <= 17:
    if bpm < 80:
        print('Beats per minute are below the appropriate range')
    elif bpm <= 100:
        print('Beats per minute are within the appropriate range')
    else:
        print('Beats per minute are above the appropriate range')

elif age >= 18 and age < 65:
    if bpm < 70:
        print('Beats per minute are below the appropriate range')
    elif bpm <= 80:
        print('Beats per minute are within the appropriate range')
    else:
        print('Beats per minute are above the appropriate range')

elif age >= 65:
    if bpm < 50:
        print('Beats per minute are below the appropriate range')
    elif bpm <= 60:
        print('Beats per minute are within the appropriate range')
    else:
        print('Beats per minute are above the appropriate range')

else:
    print('It was not possible to verify the heartbeat for this age!')