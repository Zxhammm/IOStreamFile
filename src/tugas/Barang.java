package tugas;

public class Barang {
    private String nama;
    private String kategori;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, String kategori, double harga, int stok) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    // Getters
    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Menyimpan data barang ke satu baris teks (format CSV)
    public String keBaris() {
        return nama + "," + kategori + "," + harga + "," + stok;
    }

    // Menampilkan informasi barang secara lengkap
    public void info() {
        System.out.println("==============================");
        System.out.println("Nama     : " + nama);
        System.out.println("Kategori : " + kategori);
        System.out.println("Harga    : Rp " + String.format("%,.0f", harga));
        System.out.println("Stok     : " + stok + " unit");
        System.out.println("==============================");
    }
}
