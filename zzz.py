qtd_sorvetes = 0
valor_total = 0.0
finalizar_pedido = False

print("Bem-vindo à Sorveteria!")

while not finalizar_pedido:
    print("\nOpções de Sorvetes:")
    print("1. 1 Bola casquinha - R$6,00")
    print("2. 2 Bolas casquinha - R$9,00")
    print("3. 2 Bolas cascão recheado - R$12,00")
    opcao = int(input("Escolha uma opção de sorvete (ou '0' para finalizar o pedido): "))
    
    match opcao:
        case 0:
            finalizar_pedido = True
        case 1:
            valor_sorvete = 6.00
        case 2:
            valor_sorvete = 9.00
        case 3:
            valor_sorvete = 12.00
        case _:
            print("Opção inválida. Escolha um número válido.")
            
    print(opcao)
    if 1 <= opcao <= 3:
        qtd = int(input("Quantas unidades deste sorvete? "))
        qtd_sorvetes += qtd
        valor_total += valor_sorvete * qtd

        for i in range(qtd):
            escolha_cobertura = int(input("Deseja cobertura 1 – Sim, 2 – Não? "))
            if escolha_cobertura == 1:
                print("Opções de Cobertura:")
                print("1. Chocolate - R$2,00")
                print("2. Morango - R$2,00")
                print("3. Avelã - R$3,00")
                opcao_cobertura = int(input("Escolha uma opção de cobertura: "))

                match opcao_cobertura:
                    case 1:
                        valor_total += 2.00
                    case 2:
                        valor_total += 2.00
                    case 3:
                        valor_total += 3.00
                    case _:
                        print("Opção inválida. Sem cobertura.")

print("\nResumo do Pedido:")
print("Quantidade de Sorvetes:", qtd_sorvetes)
print("Valor Total: R$", valor_total)
print("Obrigado pela preferência!")