package agh.po.symulator;

public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Pozycja aktualnaPozycja;

    private boolean stanWlaczenia;
    private String nrRejest;
    private String model;
    private double predkoscMax;

    public Samochod() {
        Sprzeglo sprzeglo = new Sprzeglo("SACHS", "RCS 1/200", 15.0, 800.0);
        this.skrzynia = new SkrzyniaBiegow("ZF", "8HP", 85.0, 3500.0, 8, sprzeglo, new double[] {-0.2694, 0.1905, 0.4604, 0.5814, 0.7599, 1.0, 1.2165, 1.5625});
        this.silnik = new Silnik("BMW", "B58TU2", 180.0, 8000.0, 7000, 800);
        this.aktualnaPozycja = new Pozycja(0, 0);
        this.stanWlaczenia = false;
        this.nrRejest = "KR 00001";
        this.model = "Testowy";
        this.predkoscMax = 250.0;
    }

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja aktualnaPozycja,
                    String nrRejest, String model, double predkoscMax) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = aktualnaPozycja;
        this.stanWlaczenia = false;
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
    }

    public void wlacz() {
        silnik.uruchom();
        skrzynia.wyzerujBieg();
        stanWlaczenia = true;
    }

    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.wyzerujBieg();
        stanWlaczenia = false;
    }

    public void jedzDo(Pozycja cel) {
        if (!stanWlaczenia) {
            System.out.println("Najpierw włącz samochód!");
            return;
        }
        double dx = cel.getX() - aktualnaPozycja.getX();
        double dy = cel.getY() - aktualnaPozycja.getY();
        aktualnaPozycja.aktualizujPozycje(dx, dy);
    }

    public double getWaga() {
        return silnik.getWaga()
                + skrzynia.getWaga()
                + skrzynia.getSprzeglo().getWaga();
    }

    public double getAktPredkosc() {
        if (!stanWlaczenia || skrzynia.getAktBieg() == 0) {
            return 0.0;
        }
        double predkosc = silnik.getObroty() * skrzynia.getAktPrzelozenie() * 0.015;
        return Math.min(predkosc, predkoscMax);
    }

    public Pozycja getAktPozycja() {
        return aktualnaPozycja;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }

    public boolean isStanWlaczenia() {
        return stanWlaczenia;
    }

    public String getNrRejest() {
        return nrRejest;
    }

    public String getModel() {
        return model;
    }

    public double getPredkoscMax() {
        return predkoscMax;
    }

    public void wyswietlStan() {
        System.out.println("=== Stan samochodu (" + model + ", " + nrRejest + ") ===");
        System.out.println("Włączony: " + stanWlaczenia);
        System.out.println("Obroty silnika: " + silnik.getObroty() + " / " + silnik.getMaxObroty());
        System.out.println("Aktualny bieg: " + skrzynia.getAktBieg());
        System.out.println("Sprzęgło wciśnięte: " + skrzynia.getSprzeglo().isStanSprzegla());
        System.out.println("Prędkość: " + getAktPredkosc() + " km/h");
        System.out.println("Pozycja: " + aktualnaPozycja.getPozycja());
        System.out.println("Waga komponentów: " + getWaga() + " kg");
        System.out.println();
    }
}