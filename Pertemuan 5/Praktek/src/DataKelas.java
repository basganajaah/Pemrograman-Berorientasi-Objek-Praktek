import com.polban.akademik.MataKuliah;
import com.polban.akademik.Jadwal;
import com.polban.akademik.Civitas.Dosen;
import com.polban.akademik.Civitas.Mahasiswa;
import com.polban.akademik.Ruangan;
import com.polban.akademik.Utility;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DataKelas {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswaList = {
                new Mahasiswa("Ahmad Fauzan Naji", "231511033"),
                new Mahasiswa("Alanna Tanisya Anwar", "231511034"),
                new Mahasiswa("Alya Gustiani Nur Afifah", "231511035"),
                new Mahasiswa("Azka Darajat", "231511036"),
                new Mahasiswa("Bandyaga Adiansyah Sugandi", "231511037"),
                new Mahasiswa("Daff Al Giffari", "231511038"),
                new Mahasiswa("Daiva Raditya Pradipa", "231511039"),
                new Mahasiswa("Dhea Dria Spralia", "231511040"),
                new Mahasiswa("Dhira Ramadini", "231511041"),
                new Mahasiswa("Dwika Ali Ramdhan", "231511042"),
        };
        Dosen[] dosenList = {
                new Dosen("Yudi Widhiyasana", "KO006N"),
                new Dosen("Santi Sundari", "KO009N"),
                new Dosen("Trisna Gelar", "KO078N"),
                new Dosen("Ade Hodijah", "KO060N"),
                new Dosen("Muhammad Rizqi", "KO074N"),
                new Dosen("Bambang Wisnuadhi", "KO003N"),
                new Dosen("Ade Chandra Nugraha", "KO001N"),
                new Dosen("Zulkifli Arsyad", "KO061N"),
                new Dosen("Siti Dwi Setiarini", "KO075N"),
                new Dosen("Yadhi Aditya", "KO052N"),
        };

        Ruangan[] ruanganList = {
                new Ruangan("D105-Kelas"),
                new Ruangan("D102-Lab. MT"),
                new Ruangan("D106-Lab. SDB"),
                new Ruangan("D101-Kelas"),
                new Ruangan("D116-Lab. PjBL-2"),
                new Ruangan("D108-Kelas"),
        };

        MataKuliah[] mataKuliahList = {
                new MataKuliah("21IF2015", "Komputasi Grafik (Teori)", dosenList[0], ruanganList[0]),
                new MataKuliah("21IF2013", "Pengantar Rekayasa Perangkat Lunak (Teori)", dosenList[1], ruanganList[0]),
                new MataKuliah("21IF2015", "Komputasi Grafik (Praktek)", dosenList[2], ruanganList[1]),
                new MataKuliah("21IF2012", "Basis Data (Praktek)", dosenList[3], ruanganList[2]),
                new MataKuliah("21IF2014", "Aljabar Linear (Teori)", dosenList[4], ruanganList[3]),
                new MataKuliah("21IF2016", "Proyek 3 - Aplikasi Web (Praktek)", dosenList[5], ruanganList[4]),
                new MataKuliah("21IF2012", "Basis Data (Teori)", dosenList[6], ruanganList[5]),
                new MataKuliah("21IF2011", "Pemrograman Berorientasi Objek (Teori)", dosenList[7], ruanganList[5]),
                new MataKuliah("21IF2011", "Pemrograman Berorientasi Objek (Praktek)", dosenList[7], ruanganList[4]),
                new MataKuliah("21IF2010", "Matematika Diskrit (Teori)", dosenList[8], ruanganList[5]),
                new MataKuliah("21IF2013", "Pengantar Rekayasa Perangkat Lunak (Praktek)", dosenList[9], ruanganList[4]),
        };

        List<MataKuliah> mataKuliahSenin = Arrays.asList(mataKuliahList[0], mataKuliahList[1], mataKuliahList[2]);
        List<MataKuliah> mataKuliahSelasa = Arrays.asList(mataKuliahList[3], mataKuliahList[4]);
        List<MataKuliah> mataKuliahRabu = List.of(mataKuliahList[5]);
        List<MataKuliah> mataKuliahKamis = Arrays.asList(mataKuliahList[6], mataKuliahList[7], mataKuliahList[8], mataKuliahList[9]);
        List<MataKuliah> mataKuliahJumat = List.of(mataKuliahList[10]);

        Jadwal[] jadwalList = {
                new Jadwal("Senin", "08:40 - 15:30", mataKuliahSenin),
                new Jadwal("Selasa", "07:00 - 14:40", mataKuliahSelasa),
                new Jadwal("Rabu", "07:00 - 16:40", mataKuliahRabu),
                new Jadwal("Kamis", "07:00 - 16:40", mataKuliahKamis),
                new Jadwal("Jumat", "07:50 - 14:40", mataKuliahJumat),
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih opsi:");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Tampilkan Data Dosen");
        System.out.println("3. Tampilkan Jadwal Perkuliahan");
        System.out.print("Masukkan pilihan Anda: ");
        int choices = scanner.nextInt();
        switch (choices) {
            case 1:
                System.out.println("\nData Mahasiswa Kelas 2B-D3 Teknik Informatika");
                Utility.cetakGaris(50);
                System.out.printf("%-30s %-15s %n", "Nama Mahasiswa", "NIM");
                Utility.cetakGaris(50);
                for (Mahasiswa mhs : mahasiswaList) {
                    mhs.tampilkanInfo();
                }
                break;
            case 2:
                System.out.println("\nData Dosen Mengajar Kelas 2B-D3 Teknik Informatika:");
                Utility.cetakGaris(50);
                System.out.printf("%-30s %-15s %n", "Nama Dosen", "Kode Dosen");
                Utility.cetakGaris(50);
                for (Dosen dosen : dosenList) {
                    dosen.tampilkanInfo();
                }
                break;
            case 3:
                System.out.println("\nJadwal Perkuliahan Kelas 2B-D3 Teknik Informatika:");
                for (Jadwal jadwal : jadwalList) {
                    jadwal.tampilkanJadwal();
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}
