
package tugas;

public class barang {
    private String nama;
    private double harga;
    private int stok;

    public barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Format untuk disimpan ke file
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Menampilkan informasi barang
    public String info() {
        return "Nama Barang : " + nama +
               "\nHarga       : Rp" + harga +
               "\nStok        : " + stok;
    }
}
