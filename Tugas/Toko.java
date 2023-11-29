package Tugas;

public class Toko {
    private String[][] barang = {
            {"a001", "a002", "a003", "a004", "a005"},
            {"Buku", "Pensil", "Pulpen", "Tas", "Binder"}
    };

    private int[] hargaBarang = {3000, 4000, 5000, 30000, 25000};

    public String[][] getBarang() {
        return this.barang;
    }

    public int[] getHargaBarang() {
        return this.hargaBarang;
    }
}