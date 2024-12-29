import java.util.Scanner;

public class simple_deviation {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double venda, desconto;

        System.out.print("Digite o valor da venda: ");
        venda = entrada.nextDouble();

        if (venda > 300) {
            desconto = venda * 10 / 100;
            venda = venda - desconto;
        }

        System.out.print("Novo valor = " + venda);

        entrada.close();
    }
}