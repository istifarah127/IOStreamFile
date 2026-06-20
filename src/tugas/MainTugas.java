/* Nama     : Istifarah Indrasasi Awal
Kelas       : 2410010256
*/  

package tugas;

public class MainTugas {
        public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
            "Makanan",
            "Minuman",
            "Alat Tulis"
        };

        System.out.println("=== DAFTAR KATEGORI ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        gudang gudang = new gudang();

        // Minimal 5 barang
        gudang.tambahBarang(
                new barang("Pensil", 3000, 50));

        gudang.tambahBarang(
                new barang("Buku Tulis", 7000, 30));

        gudang.tambahBarang(
                new barang("Penghapus", 2000, 40));

        gudang.tambahBarang(
                new barang("Air Mineral", 5000, 25));

        gudang.tambahBarang(
                new barang("Roti", 8000, 15));

        System.out.println("\n=== DATA BARANG ===");
        gudang.tampilkanSemua();

        System.out.println(
            "\nTotal Nilai Persediaan = Rp"
            + gudang.totalNilai());

        // Simpan ke file
        gudang.simpanKeBerkas("barang.txt");

        // Membuat objek gudang baru
        gudang gudangBaru = new gudang();

        // Muat kembali dari file
        gudangBaru.muatDariBerkas("barang.txt");

        System.out.println(
            "\n=== DATA HASIL MUAT DARI FILE ===");

        gudangBaru.tampilkanSemua();

        System.out.println(
            "\nTotal Nilai Persediaan = Rp"
            + gudangBaru.totalNilai());
    }
}
