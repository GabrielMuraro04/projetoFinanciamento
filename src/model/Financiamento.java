package model;

/**
 * Classe que representa um financiamento imobiliário.
 * Agora suporta cálculo com entrada e dois tipos de amortização:
 * - PRICE (parcelas fixas)
 * - SAC (amortização constante)
 */
public class Financiamento {

    public enum TipoAmortizacao {
        PRICE, SAC
    }

    private double valorImovel;
    private double valorEntrada;
    private double taxaJurosAnual; // em %
    private int prazoMeses;
    private TipoAmortizacao tipo;

    public Financiamento(double valorImovel, double valorEntrada, double taxaJurosAnual, int prazoMeses, TipoAmortizacao tipo) {
        if (valorEntrada >= valorImovel) {
            throw new IllegalArgumentException("A entrada não pode ser maior ou igual ao valor do imóvel.");
        }
        this.valorImovel = valorImovel;
        this.valorEntrada = valorEntrada;
        this.taxaJurosAnual = taxaJurosAnual;
        this.prazoMeses = prazoMeses;
        this.tipo = tipo;
    }

    public double getValorImovel() {
        return valorImovel;
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
        return valorImovel - valorEntrada;
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
}
