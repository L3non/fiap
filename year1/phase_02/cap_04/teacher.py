# Menu structure
option = -1
grades = []

while option != 4:
    print('1 - Cadastrar nota\n2 - Exibir notas\n3 - Calcular média\n4 - Sair')
    option = int(input('Informe a opção desejada: '))

    if option == 1:
        grade = float(input('Por favor, informe a nota do aluno: '))
        grades.append(grade)
    
    elif option == 2:
        print('As notas da turma são: ')
        for grade in grades:
            print(grade)
    
    elif option == 3:
        average = sum(grades) / len(grades)
        print(average)
    
    elif option == 4:
        print('Saindo!')
    
    else:
        print('Opção invalida')