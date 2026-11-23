package agh.po.symulator;

import java.time.LocalTime;

public class Zawody {
    private String nazwa;
    private String data;

    public Zawody(String nazwa, String data) {
        this.nazwa = nazwa;
        this.data = data;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
