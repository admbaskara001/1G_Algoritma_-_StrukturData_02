package Jobsheet3.ArrayObjects.src.Praktikum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input atribut untuk Kerucut
        System.out.println("Kerucut:");
        System.out.print("Jari-jari: ");
        double jariJariKerucut = scanner.nextDouble();
        System.out.print("Sisi miring: ");
        double sisiMiringKerucut = scanner.nextDouble();
        Kerucut kerucut = new Kerucut(jariJariKerucut, sisiMiringKerucut);
        System.out.println("Luas permukaan: " + kerucut.hitungLuasPermukaan());
        System.out.println("Volume: " + kerucut.hitungVolume());

        // Input atribut untuk Limas Segi Empat
        System.out.println("\nLimas Segi Empat Sama Sisi:");
        System.out.print("Panjang sisi alas: ");
        double sisiAlasLimas = scanner.nextDouble();
        System.out.print("Tinggi limas: ");
        double tinggiLimas = scanner.nextDouble();
        LimasSegiEmpat limas = new LimasSegiEmpat(sisiAlasLimas, tinggiLimas);
        System.out.println("Luas permukaan: " + limas.hitungLuasPermukaan());
        System.out.println("Volume: " + limas.hitungVolume());

        // Input atribut untuk Bola
        System.out.println("\nBola:");
        System.out.print("Jari-jari: ");
        double jariJariBola = scanner.nextDouble();
        Bola bola = new Bola(jariJariBola);
        System.out.println("Luas permukaan: " + bola.hitungLuasPermukaan());
        System.out.println("Volume: " + bola.hitungVolume());

        scanner.close();
    }
}

