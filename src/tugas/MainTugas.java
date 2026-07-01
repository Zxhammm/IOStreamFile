package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // ── 1. Array kategori (minimal 3, ukuran tetap) ──────────────────────
        String[] kategori = {"Elektronik", "Makanan & Minuman", "Pakaian", "Peralatan Rumah", "Alat Tulis"};

        System.out.println("===== KATEGORI BARANG YANG TERSEDIA =====");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }

        // ── 2. Buat Gudang dan tambah minimal 5 objek Barang ─────────────────
        Gudang gudang1 = new Gudang();

        gudang1.tambahBarang(new Barang("Laptop ASUS",      "Elektronik",           8500000, 10));
        gudang1.tambahBarang(new Barang("Mie Instan",       "Makanan & Minuman",       3500, 200));
        gudang1.tambahBarang(new Barang("Kaos Polos",       "Pakaian",               75000,  50));
        gudang1.tambahBarang(new Barang("Panci Teflon",     "Peralatan Rumah",       120000,  30));
        gudang1.tambahBarang(new Barang("Pensil 2B",        "Alat Tulis",              5000, 150));
        gudang1.tambahBarang(new Barang("Headphone Sony",   "Elektronik",            350000,  25));

        // ── 3. Tampilkan semua barang ─────────────────────────────────────────
        gudang1.tampilkanSemua();

        // ── 4. Simpan ke berkas teks ──────────────────────────────────────────
        String namaFile = "barang.txt";
        gudang1.simpanKeBerkas(namaFile);

        // ── 5. Buat Gudang baru, muat dari berkas, tampilkan & total nilai ────
        System.out.println("\n===== MEMUAT DATA DARI BERKAS =====");
        Gudang gudang2 = new Gudang();
        gudang2.muatDariBerkas(namaFile);

        gudang2.tampilkanSemua();

        double total = gudang2.totalNilai();
        System.out.println("\nTotal Nilai Persediaan Seluruh Barang:");
        System.out.println("Rp " + String.format("%,.0f", total));
    }
}
