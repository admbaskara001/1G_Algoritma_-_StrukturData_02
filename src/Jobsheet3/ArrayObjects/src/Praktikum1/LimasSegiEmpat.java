package Jobsheet3.ArrayObjects.src.Praktikum1;

public class LimasSegiEmpat {
    private double sisiAlas;
    private double tinggi;

    public LimasSegiEmpat(double sisiAlas, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        return sisiAlas * sisiAlas + 4 * (0.5 * sisiAlas * tinggi);
    }

    public double hitungVolume() {
        return (1.0/3) * sisiAlas * sisiAlas * tinggi;
    }
}
