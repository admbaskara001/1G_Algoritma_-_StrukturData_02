package Jobsheet2;

public class Buku02 {
    String judul, pengarang;
    int halaman, stok, harga;


    public Buku02(){

        

    }

    public Buku02(String jud, String pg, int hal, int stok, int har ){
        judul = jud;
        pengarang = pg;
        halaman =hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok habis, tidak dapat menjual buku.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitunghargTotal(int jml) {
        int hargaTotal = harga * jml;
        return hargaTotal;
    }

    int hitungDiskon(int hrgTotal){
        if (hrgTotal > 150000) {
            hrgTotal *= 0.12;
        } else if (hrgTotal >= 75000 && hrgTotal <= 150000){
            hrgTotal *= 0.05;
        } else if (hrgTotal < 75000) {
            System.out.println("Tidak diskon");
        }
        return hrgTotal;
        
    }
    int hitunghargaBayar(int hrgTotal, int hrgDiskon){
        hrgTotal -= hrgDiskon;
        return hrgTotal;
    }
}




