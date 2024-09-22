package com.polban.akademik;

public class MataKuliah {
    private final String kode;
    private final String nama;
    private final Civitas.Dosen dosenPengampu;
    private final Ruangan namaRuangan;

    public MataKuliah(String kode, String nama, Civitas.Dosen dosenPengampu, Ruangan namaRuangan) {
        this.kode = kode;
        this.nama = nama;
        this.dosenPengampu = dosenPengampu;
        this.namaRuangan = namaRuangan;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public Civitas.Dosen getDosenPengampu() {
        return dosenPengampu;
    }

    public Ruangan getRuangan() {
        return namaRuangan;
    }
}
