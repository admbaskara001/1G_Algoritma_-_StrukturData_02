package Jobsheet3.ArrayObjects.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc02 = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            
            ppArray[i] = new PersegiPanjang();
            System.out.print("Persegi panjang ke-" + i);
            System.out.println("Masukkan Panjang: ");
            ppArray[i].panjang = sc02.nextInt();
            System.out.println("Masukkan Lebar: ");
            ppArray[i].lebar = sc02.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i); 
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
