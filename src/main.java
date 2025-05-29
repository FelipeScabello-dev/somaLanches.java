import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int opcao;

        do {
            System.out.println("\nTabela de Itens:");
            System.out.println("1 - Cachorro Quente - R$10,00");
            System.out.println("2 - X-Salada        - R$15,00");
            System.out.println("3 - X-Bacon         - R$17,00");
            System.out.println("4 - Torrada Simples - R$5,00");
            System.out.println("5 - Refrigerante 2L - R$10,00");

            System.out.print("\nDigite o código do item: ");
            int codigo = sc.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            double preco = 0;

            switch (codigo) {
                case 1:
                    preco = 10.00;
                    break;
                case 2:
                    preco = 15.00;
                    break;
                case 3:
                    preco = 17.00;
                    break;
                case 4:
                    preco = 5.00;
                    break;
                case 5:
                    preco = 10.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    preco = 0;
                    quantidade = 0;
            }

            double subtotal = preco * quantidade;
            total += subtotal;

            if (preco != 0) {
                System.out.printf("Subtotal deste item: R$ %.2f%n", subtotal);
            }

            System.out.print("\nDeseja pedir outro item? (1 - Sim | 0 - Não): ");
            opcao = sc.nextInt();

        } while (opcao == 1);

        System.out.printf("\nValor total da compra: R$ %.2f%n", total);

        sc.close();
    }
}
