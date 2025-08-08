public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(1, 2);
        System.out.println(sum);

        Candy brigadeiro = new Candy();
        brigadeiro.name = "Chocolate brigadeiro";
        brigadeiro.tellName();
    }
}