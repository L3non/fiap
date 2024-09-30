# A Bidu é uma startup na área de Fintech fundada em 2011 que ajuda os usuários a controlar suas fontes de receitas, gastos, dívidas e investimentos.  Ela precisa realizar uma votação para escolher qual dia da semana é o melhor para a realização das lives com o time da mentoria financeira. Desenvolva um programa em que os colaboradores informem um dos 5 dias da semana (segunda-feira, terça-feira, quarta-feira, quinta-feira e sexta-feira) da sua preferência para participar da live. Verifique e exiba ao final, qual dia foi o escolhido pelos colaboradores.  
# Observação: Verifique o número de colaboradores que irão participar da votação para programar sua estrutura de repetição. 
# É importante o programa validar a possibilidade de empate.

n_colaboradores = int(input('Informe o número de colaboradores: '))

segunda = 0
terca = 0
quarta = 0
quinta = 0
sexta = 0
escolha = 2  # Inicia com 2 para que o loop não seja interrompido na primeira execução
escolha_final = 2  # Inicia com 2 para que o loop não seja interrompido após empate

while True:
    for i in range(n_colaboradores):
        voto = input('Informe o dia da sua preferência (segunda-feira, terça-feira, quarta-feira, quinta-feira, sexta-feira): ').lower()

        if voto == 'segunda-feira':
            segunda += 1
        elif voto == 'terça-feira':
            terca += 1
        elif voto == 'quarta-feira':
            quarta += 1
        elif voto == 'quinta-feira':
            quinta += 1
        elif voto == 'sexta-feira':
            sexta += 1
        else:
            print('Dia inválido desconsiderado!')
            escolha = int(input(f'1 - Reiniciar votação\n2 - Continuar votação com o último voto ({voto}) desconsiderado\nO que deseja fazer? '))
            
            if escolha == 1:
                segunda = 0
                terca = 0
                quarta = 0
                quinta = 0
                sexta = 0
                print("Votação reiniciada!")
                break

            elif escolha == 2:
                print("Voto inválido ignorado, continuando a votação.")
            else:
                print(f"Opção inválida. Continuando a votação com o último voto ({voto}) desconsiderado.")
    
    # Verifica o resultado da votação
    if segunda > terca and segunda > quarta and segunda > quinta and segunda > sexta:
        print('O dia escolhido pelos colaboradores é: segunda-feira')
        break
    elif terca > segunda and terca > quarta and terca > quinta and terca > sexta:
        print('O dia escolhido pelos colaboradores é: terça-feira')
        break
    elif quarta > segunda and quarta > terca and quarta > quinta and quarta > sexta:
        print('O dia escolhido pelos colaboradores é: quarta-feira')
        break
    elif quinta > segunda and quinta > terca and quinta > quarta and quinta > sexta:
        print('O dia escolhido pelos colaboradores é: quinta-feira')
        break
    elif sexta > segunda and sexta > terca and sexta > quarta and sexta > quinta:
        print('O dia escolhido pelos colaboradores é: sexta-feira')
        break
    else:
        print('Houve um empate!')
        escolha_final = int(input(f'1 - Reiniciar votação\n2 - Encerrar votação com empate\nO que deseja fazer? '))
        
        if escolha_final == 1:
            segunda = 0
            terca = 0
            quarta = 0
            quinta = 0
            sexta = 0
            print("Votação reiniciada!")
        elif escolha_final == 2:
            print('Votação encerrada com empate!')
            break
        else:
            print("Opção inválida. Votação será encerrada com empate!")
            break

    # Ao sair do loop for, se a votação não tiver sido reiniciada, encerra o while
    if escolha != 1 and escolha_final != 1:
        break