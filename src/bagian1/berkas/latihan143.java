package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class latihan143 {
    public static void main(String[] args) {
        try {
            File file = new File("sementara.txt");

            // Membuat file
            file.createNewFile();

            System.out.println("Status sebelum dihapus: " + file.exists());

            // Menghapus file
            file.delete();

            System.out.println("Status sesudah dihapus: " + file.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}