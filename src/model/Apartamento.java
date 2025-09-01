package model;

public class Apartamento implements Imovel {

    private String endereco;
    private double area;
    private int numeroQuartos;
    private int numeroBanheiros;
    private int andar;
    private boolean possuiElevador;
    private double valor;

    public Apartamento(String endereco, double area, int numeroQuartos, int numeroBanheiros, int andar, boolean possuiElevador, double valor) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.numeroBanheiros = numeroBanheiros;
        this.andar = andar;
        this.possuiElevador = possuiElevador;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "endereco='" + endereco + '\'' +
                ", area=" + area +
                ", quartos=" + numeroQuartos +
                ", banheiros=" + numeroBanheiros +
                ", andar=" + andar +
                ", elevador=" + possuiElevador +
                ", valor=" + valor +
                '}';
    }
}
