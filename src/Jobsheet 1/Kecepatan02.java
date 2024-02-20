import java.util.Scanner;

public class Kecepatan02 {
    public static double hitungKecepatan(double s, double t) {
        return s / t;
    }

    public static double hitungJarak(double v, double t) {
        return v * t;
    }

    public static double hitungWaktu(double s, double v) {
        return s / v;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih rumus yang akan dihitung (kecepatan/jarak/waktu): ");
        String pilihan = input.next();

        System.out.println("Masukkan nilai s: ");
        double s = input.nextDouble();
        System.out.println("Masukkan nilai t: ");
        double t = input.nextDouble();

        switch (pilihan) {
            case "kecepatan":
                System.out.println("Kecepatan: " + hitungKecepatan(s, t));
                break;
            case "jarak":
                System.out.println("Jarak: " + hitungJarak(s, t));
                break;
            case "waktu":
                System.out.println("Waktu: " + hitungWaktu(s, t));
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
