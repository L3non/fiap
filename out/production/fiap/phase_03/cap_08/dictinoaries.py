contacts = {
    'Clark Kent': {
        'cellphone': '123456',
        'email': 'clark@krypton.com'
    },

    'Bruce Wayne': {
        'cellphone': '654321',
        'email': 'bat@caverna.com'
    }
}

print(contacts)

for name, contact_means in contacts.items():
    print(f'The contact {name}')

    for means, value in contact_means.items():
        print('Can be contacted by {means} on {value}')
    
    print('\n')