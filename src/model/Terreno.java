package model;

public class Terreno implements Imovel {

    private String endereco;
    private double area;
    private boolean possuiMurado;
    private boolean possuiInfraestrutura;
    private double valor;

    public Terreno(String endereco, double area, boolean possuiMurado, boolean possuiInfraestrutura, double valor) {
        this.endereco = endereco;
        this.area = area;
        this.possuiMurado = possuiMurado;
        this.possuiInfraestrutura = possuiInfraestrutura;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Terreno{" +
                "endereco='" + endereco + '\'' +
                ", area=" + area +
                ", murado=" + possuiMurado +
                ", infraestrutura=" + possuiInfraestrutura +
                ", valor=" + valor +
                '}';
    }
}
