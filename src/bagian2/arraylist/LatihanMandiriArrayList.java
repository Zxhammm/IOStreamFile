/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {

        System.out.println("=== SOAL 1 ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Tambah 4 item
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Telur Ayam");
        daftarBelanja.add("Beras 5kg");
        daftarBelanja.add("Mie Instan");
        
        // Hapus item ke-2 
        daftarBelanja.remove(1); 
        
        // Tampilkan isi list dan jumlah akhirnya
        System.out.println("Isi daftar belanja saat ini: " + daftarBelanja);
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
        System.out.println();

        System.out.println("=== SOAL 2 ===");
        ArrayList<Integer> listAngka = new ArrayList<>();
        listAngka.add(24);
        listAngka.add(87);
        listAngka.add(45);
        listAngka.add(99);
        listAngka.add(12);
        
        int terbesar = listAngka.get(0); // Inisialisasi dengan elemen pertama
        
        for (int i = 1; i < listAngka.size(); i++) {
            if (listAngka.get(i) > terbesar) {
                terbesar = listAngka.get(i);
            }
        }
        System.out.println("Isi list angka: " + listAngka);
        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println();


        System.out.println("=== SOAL 3 ===");
        ArrayList<String> daftarNama = new ArrayList<>();
        // Menambah 6 nama
        daftarNama.add("Ahmad");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Andi");
        daftarNama.add("Dedi");
        
        System.out.println("Nama yang diawali huruf 'A':");
        for (int i = 0; i < daftarNama.size(); i++) {
            String nama = daftarNama.get(i);
            // Menggunakan method startsWith
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}