package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner = new Scanner(System.in);

    public double lerValorImovel() {
        double valor;
        do {
            try {
                System.out.print("Digite o valor do imóvel: R$ ");
                valor = scanner.nextDouble();
                if (valor <= 0) throw new IllegalArgumentException("Valor deve ser positivo.");
                return valor;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Erro: Entrada inválida. Tente novamente.");
                scanner.nextLine();
            }
        } while (true);
    }

    public int lerPrazoFinanciamento() {
        int prazo;
        do {
            try {
                System.out.print("Digite o prazo em anos: ");
                prazo = scanner.nextInt();
                if (prazo <= 0) throw new IllegalArgumentException("Prazo deve ser positivo.");
                return prazo;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Erro: Entrada inválida. Tente novamente.");
                scanner.nextLine();
            }
        } while (true);
    }

    public double lerTaxaJuros() {
        double taxa;
        do {
            try {
                System.out.print("Digite a taxa de juros anual (ex: 0.1 para 10%: ");
                taxa = scanner.nextDouble();
                if (taxa <= 0) throw new IllegalArgumentException("Taxa deve ser positiva.");
                return taxa;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Erro: Entrada inválida. Tente novamente.");
                scanner.nextLine();
            }
        } while (true);
    }
}
