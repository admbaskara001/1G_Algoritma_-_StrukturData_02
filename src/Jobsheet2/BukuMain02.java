package Jobsheet2;
public class BukuMain02 {
    public static void main(String[] args) {
        Buku02 bk1 = new Buku02();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        
        bk1.tampilInformasi();
        bk1.terjual (5);
        bk1.gantiHarga (60000);
        bk1.tampilInformasi();

        Buku02 bk2 = new Buku02("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku02 bukubaru = new Buku02("Belajar Java", "Adham Baskara", 200, 10, 50000);
        bukubaru.tampilInformasi();
    }
}
