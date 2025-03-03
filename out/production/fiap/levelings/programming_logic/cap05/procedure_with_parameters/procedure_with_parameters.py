def greetings(time):
    if time < 12:
        msg = 'Good morning'
    elif time < 18:
        msg = 'Good afternoon'
    else:
        msg = 'Good evening'
    
    print(f'{msg}, Welcome to FIAP!')

greetings(12)