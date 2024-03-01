package Jobsheet3.ArrayObjects.src.Praktikum1;

public class Bola {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4.0/3) * Math.PI * jariJari * jariJari * jariJari;
    }
}
