import java.util.Scanner;

public class Indeks02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah matakuliah: ");
        int jumlahMatakuliah = input.nextInt();
        String[] namaMatakuliah = new String[jumlahMatakuliah];
        double[] bobotSKS = new double[jumlahMatakuliah];
        String[] nilaiHuruf = new String[jumlahMatakuliah];

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan nama matakuliah: ");
            namaMatakuliah[i] = input.next();
            System.out.println("Masukkan bobot SKS: ");
            bobotSKS[i] = input.nextDouble();
            System.out.println("Masukkan nilai huruf: ");
            nilaiHuruf[i] = input.next();
        }

        double totalBobotNilai = 0;
        double totalSKS = 0;

        for (int i = 0; i < jumlahMatakuliah; i++) {
            double nilai = 0;
            switch (nilaiHuruf[i]) {
                case "A":
                    nilai = 4.0;
                    break;
                case "B+":
                    nilai = 3.5;
                    break;
                case "B":
                    nilai = 3.0;
                    break;
                case "C+":
                    nilai = 2.5;
                    break;
                case "C":
                    nilai = 2.0;
                    break;
                case "D":
                    nilai = 1.0;
                    break;
                case "E":
                    nilai = 0.0;
                    break;
            }

            totalBobotNilai += nilai * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        double IPSemester = totalBobotNilai / totalSKS;
        System.out.println("IP Semester: " + IPSemester);
    }
}
