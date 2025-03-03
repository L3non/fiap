def valid_grade(grade):
    if grade >= 0 and grade <= 10:
        return True
    else:
        return False
    
grade1 = float(input('Enter the first grade: '))

if (valid_grade(grade1)):
    grade2 = float(input('Enter the second grade: '))

    if (valid_grade(grade2)):
        average = (grade1 + grade2) / 2
        print(f'The average between {grade1} and {grade2} is {average}')
    else:
        print(f'The grade 2 => "{grade2}" is not valid')
else:
    print(f'The grade 1 => "{grade1}" is not valid')