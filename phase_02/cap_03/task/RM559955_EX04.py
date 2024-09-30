# Toda vez que um cliente realiza um resgate de uma aplicação financeira, o sistema deve calcular a alíquota de imposto de renda (IR) que deve ser aplicada sobre aquele resgate, levando em consideração o número de dias que o valor permaneceu aplicado, de acordo com a tabela abaixo:

# Até 180 dias = alíquota de 22,5% de IR.
# De 181 a 360 dias = alíquota de 20% de IR.
# De 361 a 720 dias = alíquota de 17,5% de IR.
# Acima de 720 dias = alíquota de 15% de IR.

# É o que acontece, por exemplo, com o CDB - Certificado de Depósito Bancário, uma aplicação de renda fixa comumente oferecida pelas Fintechs. Outros investimentos em renda fixa, como LCI e LCA, respectivamente, Letra de Crédito Imobiliário e Letra de Crédito do Agronegócio são isentos de imposto de renda. Escreva um programa que receba o tipo de investimento do qual se deseja realizar um resgate (1 para CDB, 2 para LCI e 3 para LCA), o valor a ser resgatado e o número de dias que esse valor permaneceu investido e, se for o caso, calcule o valor referente ao imposto de renda.

# Atenção! O programa deve consistir se o investimento fornecido é válido, ou seja, 1, 2 o 3.

# Receba o tipo de investimento do qual se deseja realizar um resgate (1 para CDB, 2 para LCI e 3 para LCA)
investimento_tipo = int(input('Escolha o tipo de investimento:\n1. CDB\n2. LCI\n3. LCA\nDigite o tipo de investimento (1, 2 ou 3): '))

# Calcule o valor referente ao imposto de renda
if investimento_tipo == 1:
    # O valor a ser resgatado
    resgate_valor = float(input('Digite o valor a ser resgatado: '))

    # O número de dias que esse valor permaneceu investido
    dias_investidos = int(input('Digite o número de dias que o valor permaneceu investido: '))

    if dias_investidos <= 180:
        ir_juros = 1 - 22.5 / 100
    elif dias_investidos >= 181 and dias_investidos <= 360:
        ir_juros = 1 - 20 / 100
    elif dias_investidos >= 361 and dias_investidos <= 720:
        ir_juros = 1 - 17.5 / 100
    else:
        ir_juros = 1 - 15 / 100

    ir_valor = resgate_valor - (resgate_valor * ir_juros)

    print(f'O valor do imposto de renda a ser pago é: R$ {ir_valor:.2f}')

elif investimento_tipo == 2:
    print('O investimento em renda fixa LCI é isento de imposto de renda.')

elif investimento_tipo == 3:
    print('O investimento em renda fixa LCA é isento de imposto de renda.')

else:
    print('Tipo de investimento inválido!')