package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) throws IOException {

        // ========== Soal 1 ==========
        File berkas = new File("Laporan.txt");

        if (berkas.createNewFile()) {
            System.out.println("Berkas dibuat: " + berkas.getName());
        } else {
            System.out.println("Berkas sudah ada: " + berkas.getName());
        }

        System.out.println("Ukuran (byte): " + berkas.length());

        // ========== Soal 2 ==========
        File folder = new File("arsip");

        if (folder.mkdir()) {
            System.out.println("Folder berhasil dibuat: " + folder.getName());
        } else {
            System.out.println("Gagal membuat folder: " + folder.getName());
        }

        // ========== Soal 3 ==========
        File berkasTemp = new File("sementara.txt");
        berkasTemp.createNewFile(); // buat dulu berkasnya

        System.out.println("Sebelum dihapus - Ada? " + berkasTemp.exists());

        berkasTemp.delete();

        System.out.println("Sesudah dihapus - Ada? " + berkasTemp.exists());
    }
}