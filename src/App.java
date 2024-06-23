import java.util.Scanner;

public class App {

    private static final CalculoJurosFactory factory = new CalculoJurosFactory();
    private static final Template template = new Template();

    private static ICalculaJuros calculadora;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora digital de juros");
        System.out.println("Abaixo as modalidades disponíveis para cálculo de juros");
        System.out.println("xxxxxxxx ESCOLHA xxxxxxxxx");
        System.out.println("[1] - Simples");
        System.out.println("[2] - Compostos");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
            case 2:
                calculadora = factory.geraCalculadora(opcao);
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        // Receber os dados do usuário
        System.out.print("Digite o capital: ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o tempo em anos: ");
        int tempoEmAnos = scanner.nextInt();

        template.exibeValorFinal(calculadora, capital, taxaJuros, tempoEmAnos);
       
        scanner.close();
    }
}
