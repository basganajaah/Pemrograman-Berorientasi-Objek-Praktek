public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        family.addUncle("Bandyaga");
        family.addUncle("Adiansyah");
        family.addUncle("Sugandi");

        family.addNiece("Aga", 1, 4);
        family.addNiece("Basgan", 16, 11);
        family.addNiece("Panda", 25, 12);

        Uncle bandyaga = family.findUncle("Bandyaga");
        Uncle adiansyah = family.findUncle("Adiansyah");
        Uncle sugandi = family.findUncle("Sugandi");

        Niece aga = family.findNiece("Aga");
        Niece basgan = family.findNiece("Basgan");
        Niece panda = family.findNiece("Panda");

        bandyaga.setFamily(family);
        adiansyah.setFamily(family);
        sugandi.setFamily(family);
        aga.setFamily(family);
        basgan.setFamily(family);
        panda.setFamily(family);

        bandyaga.addPresent(aga, "The Wonder of Computers");
        adiansyah.addPresent(basgan, "Handmade Scarf");
        sugandi.addPresent(panda, "Beautiful Necklace");

        System.out.println("Daftar Paman:");
        family.listUncles();

        System.out.println("\nDaftar Keponakan:");
        family.listNieces();

        bandyaga.listPresents();
        adiansyah.listPresents();
        sugandi.listPresents();

        aga.listPresents();
        basgan.listPresents();
        panda.listPresents();

        System.out.println("\nMenghapus hadiah untuk Aga setelah ulang tahunnya...");
        int removedCount = aga.clearPresents();
        System.out.println("Total hadiah yang dihapus untuk Aga: " + removedCount);

        System.out.println("\nSetelah penghapusan:");
        aga.listPresents();
    }
}
