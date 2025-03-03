# Creating a empty list.
contacts = []

# Procedure to create a new contacts on list
def new():
    # Defining variable as global.
    global contacts
    name = f_name()
    cel = input('Number....: ')
    email = input('E-mail..: ')

    # Adding data to contacts list.
    contacts.append([name, cel, email])
    print('\n== == == == == == == == == == == =='
          '\nRecord saved successfully!\n'
          '== == == == == == == == == == == ==')
    
# Procedure to read a name.
def f_name():
    return(input('Name....:'))

# Procedure to list a record
def list_data(name, cel, email):
    print('Name: %s\nNumber: %s\nEmail: %s' % (name, cel, email))
    print('== == == == == == == == == == == ==')

# Procedure to list all matrix records.
def listing(): # Function to display the contacts list.
    print('\nCONTACTS ON LIST ##################')
    for e in contacts:
        list_data(e[0], e[1], e[2])
    print('\nEND OF CONTACTS LIST ##############')

# Function to search a contact by name.
def search(name): # Function to search contacts.
    l_name = name.lower()
    for d, e in enumerate(contacts): # Run all matrix.
        if e[0].lower() == l_name: # Search the name.
            return d # Return the index name.
    return None # Return none if not found.

# Procedure to display the record or fail message.
def find(): # Function to search the name.
    f = search(f_name()) # Data input.
    if f != None:
        print('Record found!')

        # Update the variables if found.
        name = contacts[f][0]
        cel = contacts[f][1]
        email = contacts[f][2]

        # Display the record.
        list_data(name, cel, email)
    else:
        # Display the fail message.
        print('\nName not found!')

# Procedure to delete a contact.
def delete():
    global contacts
    name = f_name()

    # Return the name index or none.
    f = search(name)
    if f != None: # If find the contact.
        del contacts[f] # Delete the contact.
        print('\n== == == == == == == == == == == =='
              '\n Record DELETED with Success!\n'
              '== == == == == == == == == == == ==')
    else:
        # Record not found to delete.
        print('Name not found.')

# Procedure to edit a contact.
def edit():
    f = search(f_name()) # Data input.

    # If found the record.
    if f != None:
        # Display the name and request the editing of the others.
        name = contacts[f][0]
        print(f'Name....: {name}')
        cel = input('Number..: ')
        email = input('E-mail..: ')
        contacts[f] = [name, cel, email] # Saving the new data
        print('\n== == == == == == == == == == == =='
              '\n Record EDITED whit Success!\n'
              '== == == == == == == == == == == ==')
    else:
        print('Name not found.')

# Function to validade the typed item.
def validade(request, start, end): # Function to validate integer numbers.
    while True:
        try:
            value = int(input(request))
            if start <= value <= end:
                return(value)
            else:
                return(0)
        except ValueError:
            print('Invalid value, please enter between %d and %d' % (start, end))

# Function to return the menu item or 0 for invalid.
def menu(): # Function to display the options menu.
    print("""
    1 - Add a new contact
    2 - Edit a contact
    3 - Search a contact
    4 - Contacts list
    5 - Delete a contact
    6 - Leave""")

    return validade('Choose a option: ', 1, 6)

# MAIN PROGRAM
while True:
    option = menu()
    if option == 0:
        print('Invalid option!')
    if option == 6:
        break
    if option == 1:
        new()
    if option == 2:
        edit()
    if option == 3:
        find()
    if option == 4:
        listing()
    if option == 5:
        delete()