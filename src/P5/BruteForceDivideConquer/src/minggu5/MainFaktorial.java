package P5.BruteForceDivideConquer.src.minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for (int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" +(i+1)+ ":");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("HASIL - BRUTE FORCE");
        for(int i=0; i<elemen; i++){
            System.out.println
            ("Hasil perhitungan faktorial menggunakan Brute Force adalah" + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i=0; i<elemen; i++){
            System.out.println
            ("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
