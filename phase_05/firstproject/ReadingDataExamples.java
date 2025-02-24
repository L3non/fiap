import java.util.Scanner;

public class ReadingDataExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int qtd = sc.nextInt();

        System.out.println("Produto: " + nomeProduto + " Preço: " + preco + " Qtd: " + qtd);

        sc.close();
    }
}
