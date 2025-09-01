package model;

/**
 * Representa uma Casa para fins de financiamento.
 */
public class Casa {

    private String endereco;
    private double area; // em metros quadrados
    private int numeroQuartos;
    private int numeroBanheiros;
    private double valor; // valor do imóvel

    // Construtor
    public Casa(String endereco, double area, int numeroQuartos, int numeroBanheiros, double valor) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.numeroBanheiros = numeroBanheiros;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
