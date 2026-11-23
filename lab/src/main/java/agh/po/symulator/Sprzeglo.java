package agh.po.symulator;

public class Sprzeglo extends Komponent {
    private boolean stanSprzegla;

    public Sprzeglo(String producent, String model, double waga, double cena) {
        super(producent, model, waga, cena);
        this.stanSprzegla = false;
    }

    public void wcisnij() {
        this.stanSprzegla = true;
    }

    public void zwolnij() {
        this.stanSprzegla = false;
    }

    public boolean isStanSprzegla() {
        return stanSprzegla;
    }
}