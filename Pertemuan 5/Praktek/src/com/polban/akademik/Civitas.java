package com.polban.akademik;

public abstract class Civitas {
    protected String nama;

    public Civitas(String nama) {
        this.nama = nama;
    }

    public abstract void tampilkanInfo();

    // Subclass Mahasiswa
    public static class Mahasiswa extends Civitas {
        private final String nim;

        public Mahasiswa(String nama, String nim) {
            super(nama);
            this.nim = nim;
        }

        @Override
        public void tampilkanInfo() {
            System.out.printf("%-30s %-15s %n", nama, nim);
        }
    }

    // Subclass Dosen
    public static class Dosen extends Civitas {
        private final String kodeDosen;

        public Dosen(String nama, String kodeDosen) {
            super(nama);
            this.kodeDosen = kodeDosen;
        }

        public String getKodeDosen () {
            return kodeDosen;
        }

        @Override
        public void tampilkanInfo() {
            System.out.printf("%-30s %-10s %n", nama, kodeDosen);
        }
    }
}
