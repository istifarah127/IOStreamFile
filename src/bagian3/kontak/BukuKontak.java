
package bagian3.kontak;

import java.io.*;
import java.util.ArrayList;

public class BukuKontak {

    private ArrayList<kontak> daftarKontak = new ArrayList<>();

    public void tambahkontak(kontak k) {
        daftarKontak.add(k);
    }

    public void carikontak(String nama) {
        for (kontak k : daftarKontak) {
            if (k.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Kontak ditemukan:");
                System.out.println(k.info());
                return;
            }
        }
        System.out.println("Kontak tidak ditemukan.");
    }

    public void hapuskontak(String nama) {
        for (int i = 0; i < daftarKontak.size(); i++) {
            if (daftarKontak.get(i).getNama().equalsIgnoreCase(nama)) {
                daftarKontak.remove(i);
                System.out.println("Kontak berhasil dihapus.");
                simpanKeBerkas("kontak.txt");
                return;
            }
        }
        System.out.println("Kontak tidak ditemukan.");
    }

    public void simpanKeBerkas(String namaFile) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(namaFile));

            for (kontak k : daftarKontak) {
                bw.write(k.keBaris());
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void muatDariBerkas(String namaFile) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(namaFile));

            String baris;

            while ((baris = br.readLine()) != null) {

                String[] data = baris.split(";");

                if (data.length == 3) {
                    daftarKontak.add(
                        new kontak(
                            data[0],
                            data[1],
                            data[2]
                        )
                    );
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
