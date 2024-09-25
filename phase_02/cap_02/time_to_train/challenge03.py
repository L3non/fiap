# Your team members have been randomly selected to win a state-of-the-art console each, based on their good performance on their latest projects. However, for logistical reasons, the company is asking that all five team members receive the same device.
# Create an algorithm where the user can type in the vote of each of the 5 team members and, at the end, display which console was chosen and with how many votes.

# The options are: PLAYSTATION, XBOX and NINTENDO

# Type in the vote of each of the 5 team members
vote1 = int(input('POSSIBLE PRIZES\n1 - PLAYSTATION\n2 - XBOX\n3 - NINTENDO\n Inform which prize you want win: '))
vote2 = int(input('POSSIBLE PRIZES\n1 - PLAYSTATION\n2 - XBOX\n3 - NINTENDO\n Inform which prize you want win: '))
vote3 = int(input('POSSIBLE PRIZES\n1 - PLAYSTATION\n2 - XBOX\n3 - NINTENDO\n Inform which prize you want win: '))
vote4 = int(input('POSSIBLE PRIZES\n1 - PLAYSTATION\n2 - XBOX\n3 - NINTENDO\n Inform which prize you want win: '))
vote5 = int(input('POSSIBLE PRIZES\n1 - PLAYSTATION\n2 - XBOX\n3 - NINTENDO\n Inform which prize you want win: '))

# Display which console was chosen and with how many votes
playstation = 0
xbox = 0
nintendo = 0

if vote1 == 1:
    playstation += 1

elif vote1 == 2:
    xbox += 1

elif vote1 == 3:
    nintendo += 1

else:
    print('Collaborator 1 entered a non-existent console and his vote will be disregarded')

if vote2 == 1:
    playstation += 1

elif vote2 == 2:
    xbox += 1

elif vote2 == 3:
    nintendo += 1

else:
    print('Collaborator 2 entered a non-existent console and his vote will be disregarded')

if vote3 == 1:
    playstation += 1

elif vote3 == 2:
    xbox += 1

elif vote3 == 3:
    nintendo += 1

else:
    print('Collaborator 3 entered a non-existent console and his vote will be disregarded')

if vote4 == 1:
    playstation += 1

elif vote4 == 2:
    xbox += 1

elif vote4 == 3:
    nintendo += 1

else:
    print('Collaborator 4 entered a non-existent console and his vote will be disregarded')

if vote5 == 1:
    playstation += 1

elif vote5 == 2:
    xbox += 1

elif vote5 == 3:
    nintendo += 1

else:
    print('Collaborator 5 entered a non-existent console and his vote will be disregarded')

if playstation > xbox and playstation > nintendo:
    print('The chosen console was the playstation')

elif xbox > playstation and xbox > nintendo:
    print('The chosen console was the playstation')

elif nintendo > playstation and nintendo > xbox:
    print('The chosen console was the nintendo')

else:
    print('There was a tie, please contact management')