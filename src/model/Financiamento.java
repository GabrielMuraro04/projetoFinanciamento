/**
 * Representa um financiamento imobiliário com informações como valor, taxa e prazo.
 * Fornece métodos para calcular o valor da parcela mensal.
 * */

package model;

public abstract class Financiamento {

    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    /**
     * Construtor do financiamento.
     *
     * valorImovel Valor do imóvel
     * prazoFinanciamento Prazo do financiamento em anos
     * taxaJurosAnual Taxa de juros anual em porcentagem
     */

 public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento () {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public abstract double calcularPagamentoMensal();

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public abstract void exibirResumo();
}
