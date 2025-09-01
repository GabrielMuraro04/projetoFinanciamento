package model;

/**
 * Representa um Terreno para fins de financiamento.
 */
public class Terreno {

    private String endereco;
    private double area; // em metros quadrados
    private boolean possuiMurado; // se o terreno é murado
    private boolean possuiInfraestrutura; // água, energia, esgoto
    private double valor; // valor do terreno

    // Construtor
    public Terreno(String endereco, double area, boolean possuiMurado, boolean possuiInfraestrutura, double valor) {
        this.endereco = endereco;
        this.area = area;
        this.possuiMurado = possuiMurado;
        this.possuiInfraestrutura = possuiInfraestrutura;
        this.valor = valor;
    }

    // ----------------- Getters e Setters -----------------
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isPossuiMurado() {
        return possuiMurado;
    }

    public void setPossuiMurado(boolean possuiMurado) {
        this.possuiMurado = possuiMurado;
    }

    public boolean isPossuiInfraestrutura() {
        return possuiInfraestrutura;
    }

    public void setPossuiInfraestrutura(boolean possuiInfraestrutura) {
        this.possuiInfraestrutura = possuiInfraestrutura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
