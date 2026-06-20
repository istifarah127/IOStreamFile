package bagian2.bacatulis;

import java.io.*;

public class latihan241 {
    public static void main(String[] args) {
        try {
            // Menulis ke file
            FileWriter fw = new FileWriter("hari.txt");
            fw.write("Senin\n");
            fw.write("Selasa\n");
            fw.write("Rabu\n");
            fw.write("Kamis\n");
            fw.write("Jumat\n");
            fw.close();

            // Membaca file
            BufferedReader br = new BufferedReader(new FileReader("hari.txt"));
            String baris;

            System.out.println("Isi hari.txt:");
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}