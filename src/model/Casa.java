package model;

public class Casa implements Imovel {

    private String endereco;
    private double area;
    private int numeroQuartos;
    private int numeroBanheiros;
    private double valor;

    public Casa(String endereco, double area, int numeroQuartos, int numeroBanheiros, double valor) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.numeroBanheiros = numeroBanheiros;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "endereco='" + endereco + '\'' +
                ", area=" + area +
                ", quartos=" + numeroQuartos +
                ", banheiros=" + numeroBanheiros +
                ", valor=" + valor +
                '}';
    }
}
