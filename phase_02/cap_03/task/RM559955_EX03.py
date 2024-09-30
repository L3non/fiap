# Na oferta de um produto de crédito aos clientes, três informações são muito importantes apresentar ao cliente: valor da dívida, a taxa de juros e o número de parcelas para pagamento do empréstimo contraído junto à Fintech. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados:

# Valor da dívida, valor do juros, quantidade de parcelas e valor da parcela.

# Os juros e a quantidade de parcelas seguem a tabela:

# Quantidade de Parcelas:      % de juros sobre o valor inicial da dívida:
#            1                                     0
#            3                                     10
#            6                                     15
#            9                                     20
#            12                                    25

# Receba o valor de uma dívida
divida_valor = float(input('Digite o valor da dívida: '))
divida_valor_f = f"{divida_valor:.2f}".replace(".", ",")

# Mostre uma tabela com os seguintes dados: Valor da dívida, valor do juros, quantidade de parcelas e valor da parcela.
print(f'Total: R$ {divida_valor_f} Juros: R$ 0,00 Número de parcelas: 1 Valor da Parcela: R$ {divida_valor_f}')

for i in range (3, 13, 3):
    if i == 6:
        juros = 150
    elif i == 9:
        juros = 200
    elif i == 12:
        juros = 250
    else:
        juros = 100
    total = divida_valor + juros
    parcela_valor = total / i

    juros_f = f"{juros:.2f}".replace(".", ",")
    total_f = f"{total:.2f}".replace(".", ",")
    parcela_valor_f = f"{parcela_valor:.2f}".replace(".", ",")
    
    print(f'Total: R$ {total_f} Juros: R$ {juros_f} Número de parcelas: {i} Valor da Parcela: R$ {parcela_valor_f}')