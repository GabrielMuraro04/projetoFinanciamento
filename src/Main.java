
import model.Financiamento;
import view.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Simulador de Financiamento ===");

        double valorImovel = InterfaceUsuario.solicitarValorImovel();
        double valorEntrada = InterfaceUsuario.solicitarValorEntrada(valorImovel);
        double taxaJuros = InterfaceUsuario.solicitarTaxaJuros();
        int prazo = InterfaceUsuario.solicitarPrazo();
        Financiamento.TipoAmortizacao tipo = InterfaceUsuario.solicitarTipoAmortizacao();

        Financiamento financiamento = new Financiamento(valorImovel, valorEntrada, taxaJuros, prazo, tipo);

        double parcela = financiamento.calcularParcela();
        System.out.println("\n=== Resultado da Simulação ===");
        System.out.println("Tipo de amortização: " + tipo);
        System.out.printf("Parcela mensal: R$ %.2f%n", parcela);
    }
}
