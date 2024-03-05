import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Album02[] album = new Album02[5];

        for (int i = 0; i < album.length; i++) {
            System.out.println("Masukkan judul untuk album ke-" + (i + 1));
            System.out.print("Judul album: ");
            String judul = scanner.nextLine();
            System.out.print("Nama penyanyi: ");
            String penyanyi = scanner.nextLine();
            System.out.print("Jumlah terjual: ");
            int jumlah = scanner.nextInt();
            System.out.print("Harga per album: ");
            int harga = scanner.nextInt();
            scanner.nextLine(); 
            
            album[i] = new Album02(judul, penyanyi, jumlah, harga);
        }

        System.out.println("\nData semua album:");
        for (Album02 ab : album) {
            ab.tampil();
        }

        System.out.println("\nTotal penjualan:");
        long totalPenjualan = 0;
        for (Album02 ab : album) {
            totalPenjualan += ab.hitungPenjualan();
        }
        System.out.println(totalPenjualan);

        Album02 albumPalingLaris = album[0];
        for (Album02 ab : album) {
            if (ab.getJumlah() > albumPalingLaris.getJumlah()) {
                albumPalingLaris = ab;
            }
        }
        System.out.println("\nAlbum paling laris:");
        albumPalingLaris.tampil();
    }
}