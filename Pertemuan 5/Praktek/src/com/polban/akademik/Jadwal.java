package com.polban.akademik;
import java.util.List;

public class Jadwal {
    private final String hari;
    private final String jam;
    private final List<MataKuliah> mataKuliahList;

    public Jadwal(String hari, String jam, List<MataKuliah> mataKuliahList) {
        this.hari = hari;
        this.jam = jam;
        this.mataKuliahList = mataKuliahList;
    }

    public void tampilkanJadwal() {
        System.out.println("Hari: " + hari);
        System.out.println("Jam: " + jam);
        System.out.println("Jadwal Mata Kuliah:");
        Utility.cetakGaris(130);
        System.out.printf("%-10s %-50s %-15s %-30s %-15s %n",
                "Kode MK",
                "Mata Kuliah",
                "Kode Dosen",
                "Dosen Pengampu",
                "Ruangan");
        Utility.cetakGaris(130);
        for (MataKuliah matkul : mataKuliahList) {
            System.out.printf("%-10s %-50s %-15s %-25s %-15s %n",
                    matkul.getKode(),
                    matkul.getNama(),
                    matkul.getDosenPengampu().getKodeDosen(),
                    matkul.getDosenPengampu().nama,
                    matkul.getRuangan().getNamaRuangan());
        }
        System.out.println();
    }
}
