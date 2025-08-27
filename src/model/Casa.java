/**
 * Representa uma casa como tipo de imóvel.
 * Herda características gerais de um imóvel (Financiamento, valor, etc.).
 */

package model;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazo, double taxaJurosAnual, double areaConstruida, double tamanhoTerreno) throws AumentoMaiorDoQueJurosException {
        super(valorImovel, prazo, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;

        double parcelaBase = (valorImovel / (prazo * 12)) * (1 + (taxaJurosAnual / 12));
        double juros = parcelaBase - (valorImovel / (prazo * 12));
        if (80 > juros / 2) {
            throw new AumentoMaiorDoQueJurosException("O valor do acréscimo (R$ 80,00) é maior que metade dos juros da parcela.");
        }
    }

    @Override
    public double calcularPagamentoMensal() {
        double base = (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + (getTaxaJurosAnual() / 12));
        return base + 80;
    }

    @Override
    public void exibirResumo() {
        System.out.printf("[Casa] Imóvel: R$ %.2f | Total: R$ %.2f\n", getValorImovel(), calcularTotalPagamento());

    }
}
