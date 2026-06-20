package bagian2.bacatulis;
import java.io.*;

public class latihan243 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("hari.txt"));

            int jumlahBaris = 0;

            while (br.readLine() != null) {
                jumlahBaris++;
            }

            br.close();

            System.out.println("Jumlah baris dalam hari.txt = " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}