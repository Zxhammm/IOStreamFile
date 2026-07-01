package tugas;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Gudang {
    private ArrayList<Barang> daftarBarang;

    // Constructor
    public Gudang() {
        daftarBarang = new ArrayList<Barang>();
    }

    // Menambah barang ke daftar
    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
        System.out.println("Barang \"" + b.getNama() + "\" berhasil ditambahkan.");
    }

    // Menampilkan semua barang
    public void tampilkanSemua() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Gudang kosong, tidak ada barang.");
            return;
        }
        System.out.println("\n===== DAFTAR SEMUA BARANG =====");
        for (Barang b : daftarBarang) {
            b.info();
        }
    }

    // Menyimpan semua barang ke berkas teks
    public void simpanKeBerkas(String namaFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            for (Barang b : daftarBarang) {
                writer.write(b.keBaris());
                writer.newLine();
            }
            System.out.println("\nData berhasil disimpan ke berkas: " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan berkas: " + e.getMessage());
        }
    }

    // Memuat data barang dari berkas teks
    public void muatDariBerkas(String namaFile) {
        daftarBarang.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                String[] bagian = baris.split(",");
                if (bagian.length == 4) {
                    String nama = bagian[0];
                    String kategori = bagian[1];
                    double harga = Double.parseDouble(bagian[2]);
                    int stok = Integer.parseInt(bagian[3]);
                    daftarBarang.add(new Barang(nama, kategori, harga, stok));
                }
            }
            System.out.println("Data berhasil dimuat dari berkas: " + namaFile);
            System.out.println("Jumlah barang yang dimuat: " + daftarBarang.size());
        } catch (IOException e) {
            System.out.println("Gagal membaca berkas: " + e.getMessage());
        }
    }

    // Menghitung total nilai persediaan (harga x stok) seluruh barang
    public double totalNilai() {
        double total = 0;
        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }
        return total;
    }
}
