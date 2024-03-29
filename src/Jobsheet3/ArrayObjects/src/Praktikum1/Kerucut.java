package Jobsheet3.ArrayObjects.src.Praktikum1;

public class Kerucut {
    private double jariJari;
    private double sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return (1.0/3) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}
