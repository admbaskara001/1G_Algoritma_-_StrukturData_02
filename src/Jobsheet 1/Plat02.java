package Jobsheet1;

import java.util.Scanner;

public class Plat02 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'K', 'L', 'M'};
        String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kode plat: ");
        char kode = input.next().charAt(0);

        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                System.out.println("Kota: " + KOTA[i]);
                break;
            }
        }
    }
}
