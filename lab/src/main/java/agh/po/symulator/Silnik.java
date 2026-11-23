package agh.po.symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int minObroty;
    private int obroty;

    public Silnik(String producent, String model,double waga, double cena, int maxObroty, int minObroty) {
        super(producent, model, waga, cena);
        this.maxObroty = maxObroty;
        this.minObroty = minObroty;
        this.obroty = 0;
    }

    public void uruchom() {
        this.obroty = 1000;
    }

    public void zatrzymaj() {
        this.obroty = 0;
    }

    public void zwiekszObroty(int wartosc) {
        if (obroty > 0) {
            obroty = Math.min(obroty + wartosc, maxObroty);
        } else {
            System.out.println("Nie można zwiększyć obrotów – silnik jest wyłączony.");
        }
    }

    public void zmniejszObroty(int wartosc) {
        if (obroty > 800) {
            obroty = Math.max(obroty - wartosc, minObroty);
        }
    }

    public int getMaxObroty() {
        return maxObroty;
    }

    public int getObroty() {
        return obroty;
    }
}
