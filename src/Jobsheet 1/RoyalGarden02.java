public class RoyalGarden02 {
    static int[][] stockBunga = new int[4][4];
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar

    public static void main(String[] args) {
        // Inisialisasi data stock bunga
        initStockBunga();

        // 1. Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        for (int i = 1; i <= 4; i++) {
            System.out.println("Pendapatan RoyalGarden " + i + ": Rp " + calculateIncome(i));
        }

        // 2. Mengetahui jumlah stock setiap jenis bunga pada cabang RoyalGarden 4
        System.out.println("Stock bunga di RoyalGarden 4:");
        displayStock(3);

        // Informasi tambahan: Pengurangan stock karena bunga mati
        reduceStockDueToDeath();
        System.out.println("Stock bunga di RoyalGarden 4 setelah bunga mati:");
        displayStock(3);
    }

    public static void initStockBunga() {
        stockBunga[0] = new int[]{10, 5, 15, 7};
        stockBunga[1] = new int[]{6, 11, 9, 12};
        stockBunga[2] = new int[]{2, 10, 10, 5};
        stockBunga[3] = new int[]{5, 7, 12, 9};
    }

    public static int calculateIncome(int royalGardenIndex) {
        int totalIncome = 0;
        for (int i = 0; i < 4; i++) {
            totalIncome += stockBunga[royalGardenIndex - 1][i] * hargaBunga[i];
        }
        return totalIncome;
    }

    public static void displayStock(int royalGardenIndex) {
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < 4; i++) {
            System.out.println(jenisBunga[i] + ": " + stockBunga[royalGardenIndex - 1][i]);
        }
    }

    public static void reduceStockDueToDeath() {
        // Rincian pengurangan stock karena bunga mati
        int[] pengurangan = {-1, -2, 0, -5};

        // Pengurangan stock pada RoyalGarden 4
        for (int i = 0; i < 4; i++) {
            stockBunga[3][i] += pengurangan[i];
        }
    }
}
