package view;

import java.util.Scanner;
import model.Financiamento.TipoAmortizacao;

public class InterfaceUsuario {

    private static final Scanner scanner = new Scanner(System.in);

    // ----------------- Métodos públicos para Main -----------------

    public static double solicitarValorImovel() {
        System.out.print("Informe o valor do imóvel: R$ ");
        return lerDoublePositivo();
    }

    public static double solicitarValorEntrada(double valorImovel) {
        System.out.print("Informe o valor da entrada: R$ ");
        double valor;
        while (true) {
            valor = lerDoublePositivo();
            if (valor >= valorImovel) {
                System.out.print("A entrada não pode ser maior ou igual ao valor do imóvel. Tente novamente: R$ ");
            } else {
                break;
            }
        }
        return valor;
    }

    public static double solicitarTaxaJuros() {
        System.out.print("Informe a taxa de juros anual (%): ");
        return lerDoublePositivo();
    }

    public static int solicitarPrazo() {
        System.out.print("Informe o prazo do financiamento em meses: ");
        int prazo;
        while (true) {
            prazo = lerIntPositivo();
            if (prazo <= 0) {
                System.out.print("O prazo deve ser maior que zero. Digite novamente: ");
            } else {
                break;
            }
        }
        return prazo;
    }

    public static TipoAmortizacao solicitarTipoAmortizacao() {
        System.out.print("Escolha o tipo de amortização (1-PRICE, 2-SAC): ");
        while (true) {
            int opcao = lerIntPositivo();
            if (opcao == 1) return TipoAmortizacao.PRICE;
            else if (opcao == 2) return TipoAmortizacao.SAC;
            else System.out.print("Opção inválida. Escolha 1 para PRICE ou 2 para SAC: ");
        }
    }

    public static int lerIntPositivo() {
        while (!scanner.hasNextInt()) {
            System.out.print("Valor inválido. Digite um número inteiro: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        if (valor < 0) {
            System.out.print("Valor deve ser positivo. Digite novamente: ");
            return lerIntPositivo();
        }
        return valor;
    }

    public static double lerDoublePositivo() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número: ");
            scanner.next();
        }
        double valor = scanner.nextDouble();
        if (valor < 0) {
            System.out.print("Valor deve ser positivo. Digite novamente: ");
            return lerDoublePositivo();
        }
        return valor;
    }
}
