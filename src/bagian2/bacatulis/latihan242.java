
package bagian2.bacatulis;

import java.io.*;

public class latihan242 {
    public static void main(String[] args) {
        try {
            // Menambahkan data ke file
            FileWriter fw = new FileWriter("hari.txt", true);
            fw.write("Sabtu\n");
            fw.write("Minggu\n");
            fw.close();

            // Membaca seluruh isi file
            BufferedReader br = new BufferedReader(new FileReader("hari.txt"));
            String baris;

            System.out.println("Isi hari.txt setelah ditambah:");
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}