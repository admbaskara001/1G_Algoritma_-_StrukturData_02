class Album02 {
    private String judul;
    private String penyanyi;
    private int jumlah;
    private int harga;

    // Konstruktor dengan parameter
    public Album02(String judul, String penyanyi, int jumlah, int harga) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void tampil() {
        System.out.println("Judul: " + judul);
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println();
    }

    public long hitungPenjualan() {
        return harga * jumlah;
    }
}
