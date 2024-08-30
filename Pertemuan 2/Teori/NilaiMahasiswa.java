import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);
        
        char indexNilai = (nilaiAkhir >= 80) ? 'A' : (nilaiAkhir >= 75) ? 'B' : (nilaiAkhir >= 65) ? 'C' : (nilaiAkhir >= 49) ? 'D' : 'E';

        System.out.println("\nHasil:");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Indeks Nilai: " + indexNilai);
        
        scanner.close();
    }
}
