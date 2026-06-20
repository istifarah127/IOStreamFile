package tugas;

import java.util.ArrayList;
import java.io.*;

public class gudang {

    private ArrayList<barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {
        for (barang b : daftarBarang) {
            System.out.println("-------------------");
            System.out.println(b.info());
        }
    }

    public void simpanKeBerkas(String namaFile) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(namaFile));

            for (barang b : daftarBarang) {
                bw.write(b.keBaris());
                bw.newLine();
            }

            bw.close();

            System.out.println("Data berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
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

                    String nama = data[0];
                    double harga = Double.parseDouble(data[1]);
                    int stok = Integer.parseInt(data[2]);

                    daftarBarang.add(
                        new barang(nama, harga, stok)
                    );
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double totalNilai() {

        double total = 0;

        for (barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}
