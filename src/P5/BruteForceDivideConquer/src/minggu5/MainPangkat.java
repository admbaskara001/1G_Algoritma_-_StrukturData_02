package P5.BruteForceDivideConquer.src.minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.print("Masukkan Jumlah Elemen yang dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat[]png = new Pangkat[elemen];
        
        for(int i=0; i<elemen; i++){
            png[i]= new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemankat ke-"+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE ");
        for(int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
        for(int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
    }
}
