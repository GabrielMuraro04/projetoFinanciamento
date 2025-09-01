package model;

/**
 * Representa um Apartamento para fins de financiamento.
 */
public class Apartamento {

    private String endereco;
    private double area; // em metros quadrados
    private int numeroQuartos;
    private int numeroBanheiros;
    private int andar; // andar do apartamento
    private boolean possuiElevador; // se o prédio tem elevador
    private double valor; // valor do imóvel

    // Construtor
    public Apartamento(String endereco, double area, int numeroQuartos, int numeroBanheiros, int andar, boolean possuiElevador, double valor) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.numeroBanheiros = numeroBanheiros;
        this.andar = andar;
        this.possuiElevador = possuiElevador;
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

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroBanheiros() {
        return numeroBanheiros;
    }

    public void setNumeroBanheiros(int numeroBanheiros) {
        this.numeroBanheiros = numeroBanheiros;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isPossuiElevador() {
        return possuiElevador;
    }

    public void setPossuiElevador(boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "endereco='" + endereco + '\'' +
                ", area=" + area +
                ", quartos=" + numeroQuartos +
                ", banheiros=" + numeroBanheiros +
                ", andar=" + andar +
                ", possuiElevador=" + possuiElevador +
                ", valor=" + valor +
                '}';
    }
}
