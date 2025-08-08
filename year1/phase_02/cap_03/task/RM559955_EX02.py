# A compra de um veículo pode ser realizada parcelada. Crie um programa que receba o valor de um carro e mostre uma tabela com os seguintes dados: preço final, quantidade de parcelas e valor da parcela. Considere o seguinte: 

# a) O preço final para compra à vista tem um desconto de 20%: 
# b) A quantidade de parcelas pode ser 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60: 

# Os percentuais de acréscimo seguem na tabela abaixo:

# Quantidade de Parcelas:   Percentual de Acréscimo sobre o preço final:
#           6                                    3%
#           12                                   6%
#           18                                   9%
#           24                                   12%
#           30                                   15%
#           36                                   18%
#           42                                   21%
#           48                                   24%
#           54                                   27%
#           60                                   30%

# Receba o valor de um carro
carro_preco = float(input('Digite o preço do carro: '))

# O preço final para compra à vista tem um desconto de 20%
preco_a_vista = carro_preco * 0.8
print(f'O preço final á vista com desconto 20% é: {preco_a_vista}')

# Mostre uma tabela com os seguintes dados: preço final, quantidade de parcelas e valor da parcela
for i in range(6, 61, 6):
    juros = 1 + (i / 2 / 100)
    preco_parcelado = (carro_preco * juros)
    parcela_preco = preco_parcelado / i

    preco_parcelado_f = f"{preco_parcelado:.2f}".replace(".", ",")
    parcela_preco_f = f"{parcela_preco:.2f}".replace(".", ",")

    print(f'O preço final parcelado em {i} X é de R$ {preco_parcelado_f} com parcelas de R$ {parcela_preco_f}')