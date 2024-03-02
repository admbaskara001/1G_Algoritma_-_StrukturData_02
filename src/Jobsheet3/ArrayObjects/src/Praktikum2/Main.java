package Jobsheet3.ArrayObjects.src.Praktikum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nim: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            String jenisKelamin = scanner.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); 
            mahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            mahasiswa[i].tampilkanInfo();
        }
    }
}
