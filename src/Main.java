import model.Imovel;
import model.Casa;
import model.Apartamento;
import model.Terreno;
import model.Financiamento;
import model.Financiamento.TipoAmortizacao;
import view.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Simulador de Financiamento ===");

        // Escolha do tipo de imóvel
        System.out.println("Escolha o tipo de imóvel:");
        System.out.println("1 - Casa");
        System.out.println("2 - Apartamento");
        System.out.println("3 - Terreno");
        int opcao = InterfaceUsuario.lerIntPositivo();

        // Declarar a variável Imovel apenas uma vez
        Imovel imovelEscolhido;

        switch (opcao) {
            case 1:
                imovelEscolhido = new Casa("Rua Exemplo, 123", 120, 3, 2, 500000);
                System.out.println("Você escolheu Casa: " + imovelEscolhido);
                break;
            case 2:
                imovelEscolhido = new Apartamento("Av. Exemplo, 456", 80, 2, 2, 5, true, 400000);
                System.out.println("Você escolheu Apartamento: " + imovelEscolhido);
                break;
            case 3:
                imovelEscolhido = new Terreno("Estrada Exemplo, 789", 300, true, true, 250000);
                System.out.println("Você escolheu Terreno: " + imovelEscolhido);
                break;
            default:
                System.out.println("Opção inválida. Encerrando.");
                return;
        }

        // Solicitar valores do financiamento
        double valorEntrada = InterfaceUsuario.solicitarValorEntrada(imovelEscolhido.getValor());
        double taxaJuros = InterfaceUsuario.solicitarTaxaJuros();
        int prazo = InterfaceUsuario.solicitarPrazo();
        TipoAmortizacao tipo = InterfaceUsuario.solicitarTipoAmortizacao();

        // Criar o financiamento passando o objeto Imovel
        Financiamento financiamento = new Financiamento(imovelEscolhido, valorEntrada, taxaJuros, prazo, tipo);

        // Calcular parcela
        double parcela = financiamento.calcularParcela();

        // Exibir resultado
        System.out.println("\n=== Resultado da Simulação ===");
        System.out.println("Tipo de imóvel escolhido: " + (opcao == 1 ? "Casa" : opcao == 2 ? "Apartamento" : "Terreno"));
        System.out.println("Tipo de amortização: " + tipo);
        System.out.printf("Parcela mensal: R$ %.2f%n", parcela);

        // Exibir relatório detalhado mês a mês
        financiamento.imprimirRelatorioMensal();
    }
}


