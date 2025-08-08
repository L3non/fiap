instruments_list = ['Drums', 'Guitar', 'Acoustic guitar', 'Guitar', 'Bass']

print(instruments_list)

# How big is my list?
print(len(instruments_list))

# How many times does the element 'Guitar' appear?
print(instruments_list.count('Triangle'))

# How to change the order of list elements?
instruments_list.reverse()
print(instruments_list)

instruments_list.sort(reverse=True)
print(instruments_list)