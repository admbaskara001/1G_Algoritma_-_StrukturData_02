package Jobsheet3.ArrayObjects.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();
        
        PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];
        
        for (int i = 0; i < panjangArray; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.print("Persegi panjang ke-" + i + "\nMasukkan Panjang: ");
            ppArray[i].panjang = scanner.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = scanner.nextInt();
        }
        
        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Persegi panjang ke-" + i); 
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
        
        scanner.close();
    }
}
