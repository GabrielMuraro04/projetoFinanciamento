package model;

/**
 * Classe que representa um financiamento imobiliário.
 * Agora recebe um objeto Imovel (Casa, Apartamento ou Terreno)
 * e suporta dois tipos de amortização: PRICE e SAC.
 */
public class Financiamento {

    public enum TipoAmortizacao {
        PRICE, SAC
    }

    private Imovel imovel;
    private double valorEntrada;
    private double taxaJurosAnual; // em %
    private int prazoMeses;
    private TipoAmortizacao tipo;

    // Construtor
    public Financiamento(Imovel imovel, double valorEntrada, double taxaJurosAnual, int prazoMeses, TipoAmortizacao tipo) {
        if (valorEntrada >= imovel.getValor()) {
            throw new IllegalArgumentException("A entrada não pode ser maior ou igual ao valor do imóvel.");
        }
        this.imovel = imovel;
        this.valorEntrada = valorEntrada;
        this.taxaJurosAnual = taxaJurosAnual;
        this.prazoMeses = prazoMeses;
        this.tipo = tipo;
    }

    public double getValorImovel() {
        return imovel.getValor();
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public TipoAmortizacao getTipo() {
        return tipo;
    }

    /**
     * Calcula a taxa de juros mensal (conversão da taxa anual).
     */
    private double getTaxaJurosMensal() {
        return (taxaJurosAnual / 100) / 12;
    }

    /**
     * Calcula o valor financiado (imóvel - entrada).
     */
    private double getValorFinanciado() {
        return imovel.getValor() - valorEntrada;
    }

    /**
     * Calcula a parcela mensal pelo sistema PRICE.
     */
    public double calcularParcelaPrice() {
        double i = getTaxaJurosMensal();
        double pv = getValorFinanciado();
        return pv * (i * Math.pow(1 + i, prazoMeses)) / (Math.pow(1 + i, prazoMeses) - 1);
    }

    /**
     * Calcula a primeira parcela pelo sistema SAC.
     * (OBS: as parcelas decrescem ao longo do tempo)
     */
    public double calcularPrimeiraParcelaSac() {
        double amortizacao = getValorFinanciado() / prazoMeses;
        double juros = getValorFinanciado() * getTaxaJurosMensal();
        return amortizacao + juros;
    }

    /**
     * Retorna a parcela de acordo com o tipo de amortização.
     */
    public double calcularParcela() {
        if (tipo == TipoAmortizacao.PRICE) {
            return calcularParcelaPrice();
        } else {
            return calcularPrimeiraParcelaSac();
        }
    }

    /**
     * Imprime o relatório detalhado mês a mês
     */
    public void imprimirRelatorioMensal() {
        double saldoDevedor = getValorFinanciado();
        double taxaMensal = getTaxaJurosMensal();
        System.out.println("\n=== Relatório Mensal ===");
        System.out.printf("%-6s %-12s %-12s %-12s%n", "Mês", "Amortização", "Juros", "Saldo Devedor");

        if (tipo == TipoAmortizacao.PRICE) {
            double parcela = calcularParcelaPrice();
            for (int mes = 1; mes <= prazoMeses; mes++) {
                double juros = saldoDevedor * taxaMensal;
                double amortizacao = parcela - juros;
                saldoDevedor -= amortizacao;
                if (saldoDevedor < 0) saldoDevedor = 0;
                System.out.printf("%-6d %-12.2f %-12.2f %-12.2f%n", mes, amortizacao, juros, saldoDevedor);
            }
        } else { // SAC
            double amortizacao = getValorFinanciado() / prazoMeses;
            for (int mes = 1; mes <= prazoMeses; mes++) {
                double juros = saldoDevedor * taxaMensal;
                double parcelaMes = amortizacao + juros;
                saldoDevedor -= amortizacao;
                if (saldoDevedor < 0) saldoDevedor = 0;
                System.out.printf("%-6d %-12.2f %-12.2f %-12.2f%n", mes, amortizacao, juros, saldoDevedor);
            }
        }
    }
}
