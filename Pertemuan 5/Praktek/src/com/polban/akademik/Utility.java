package com.polban.akademik;

public class Utility {
    public static void cetakGaris(int panjangGaris) {
        for (int loop = 0; loop <= panjangGaris; loop++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
