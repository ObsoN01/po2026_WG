package agh.po.symulator;

public class Komponent {
    private double waga;
    private double cena;
    private String producent;
    private String model;

    public Komponent(String producent, String model, double waga, double cena) {
        this.producent = producent;
        this.waga = waga;
        this.cena = cena;
        this.model = model;
    }

    public String getProducent() {
        return this.producent;
    }

    public double getWaga() {
        return this.waga;
    }

    public double getCena() {
        return this.cena;
    }

    public String getModel() {
        return this.model;
    }
}
