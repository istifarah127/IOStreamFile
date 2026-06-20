
package bagian3.kontak;

public class main {
        public static void main(String[] args) {

        BukuKontak buku = new BukuKontak();

        buku.tambahkontak(
            new kontak(
                "Farah",
                "08123456789",
                "farah@gmail.com"
            )
        );

        buku.tambahkontak(
            new kontak(
                "Jaehyun",
                "082233445566",
                "budi@gmail.com"
            )
        );

        System.out.println("=== Cari Kontak ===");
        buku.carikontak("Farah");

        System.out.println("\n=== Hapus Kontak ===");
        buku.hapuskontak("Budi");
    }
}
