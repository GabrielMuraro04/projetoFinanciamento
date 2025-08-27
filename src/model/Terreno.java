/**
 * Representa um terreno como tipo de imóvel.
 */

package model;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, int prazo, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazo, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        double base = (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + (getTaxaJurosAnual() / 12));
        return base * 1.02;
    }

    @Override
    public void exibirResumo() {
        System.out.printf("[Terreno] Imóvel: R$ %.2f | Total: R$ %.2f\n", getValorImovel(), calcularTotalPagamento());
    }
}
