package model;

public class Apartamento extends Financiamento {
    private int vagasGaragem;
    private int andar;

    public Apartamento(double valorImovel, int prazo, double taxaJurosAnual, int vagasGaragem, int andar) {
        super(valorImovel, prazo, taxaJurosAnual);
        this.vagasGaragem = vagasGaragem;
        this.andar = andar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double i = getTaxaJurosAnual() / 12;
        int n = getPrazoFinanciamento() * 12;
        return (getValorImovel() * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
    }

    @Override
    public void exibirResumo() {
        System.out.printf("[Apartamento] Imóvel: R$ %.2f | Total: R$ %.2f\n", getValorImovel(), calcularTotalPagamento());
    }
}
