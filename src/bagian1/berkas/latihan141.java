package bagian1.berkas;

import java.io.File;

public class latihan141 {
    public static void main(String[] args) {
        File file = new File("laporan.txt");

        if (file.exists()) {
            System.out.println("Berkas ditemukan.");
            System.out.println("Ukuran file: " + file.length() + " byte");
        } else {
            System.out.println("Berkas tidak ditemukan.");
        }
    }
}