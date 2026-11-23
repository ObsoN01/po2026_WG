package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    private Sprzeglo sprzeglo;
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    private double[] przelozenia;

    public SkrzyniaBiegow(String producent, String model, double waga, double cena, int iloscBiegow, Sprzeglo sprzeglo, double[] przelozenia) {
        super(producent, model, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
        this.przelozenia = przelozenia;
    }

    public void zwiekszBieg() {
        if (!sprzeglo.isStanSprzegla()) {
            System.out.println("Wciśnij sprzęgło przed zmianą biegu!");
            return;
        }
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
            aktualizujPrzelozenie();
        } else {
            System.out.println("Osiągnięto maksymalny bieg.");
        }
    }

    public void zmniejszBieg() {
        if (!sprzeglo.isStanSprzegla()) {
            System.out.println("Wciśnij sprzęgło przed zmianą biegu!");
            return;
        }
        if (aktualnyBieg > -1) {
            aktualnyBieg--;
            aktualizujPrzelozenie();
        } else {
            System.out.println("Skrzynia jest już na wstecznym (-1).");
        }
    }

    public void wyzerujBieg() {
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }

    private void aktualizujPrzelozenie() {
        if (aktualnyBieg == 0) {
            this.aktualnePrzelozenie = 0.0;
        } else {
            this.aktualnePrzelozenie = aktualnyBieg * 0.6;
        }
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }

    public double getAktPrzelozenie() {
        return aktualnePrzelozenie;
    }

    public int getIloscBiegow() {
        return iloscBiegow;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }
}
