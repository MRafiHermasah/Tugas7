package Tugas;

import java.util.Scanner;

public class Sistem extends Toko {
    Scanner input = new Scanner(System.in);
    private int inputJumBeli[];
    private String inputKode[];
    private int jumlahBayar;
    private int x;

    private String[][] barang = getBarang();
    private int hargaBrg[] = getHargaBarang();

    static void headline() {
        System.out.println("TOKO SERBA ADA");
        System.out.println("***************");
    }

    public void input() {
        headline();
        System.out.print("Masukkan Item Barang   : ");
        this.x = input.nextInt();

        this.inputKode = new String[this.x];
        this.inputJumBeli = new int[this.x];

        for (int i = 0; i < this.x; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan kode        : ");
            this.inputKode[i] = input.next();
            System.out.print("Masukkan jumlah Beli : ");
            this.inputJumBeli[i] = input.nextInt();
        }
    }

    private int hitungTotal(int index, int jumBeli) {
        int jumlah = jumBeli * this.hargaBrg[index];
        return jumlah;
    }

    public void checkInputan() {
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.barang[0].length; j++) {
                if (this.inputKode[i].equals(this.barang[0][j])) {
                    System.out.println((i + 1) + "\t" + this.barang[0][j] + "     \t" + this.barang[1][j] + "    \t" + this.hargaBrg[j] + "\t" + this.inputJumBeli[i] + "\t\t" + this.hitungTotal(j, this.inputJumBeli[i]));
                    this.jumlahBayar += this.hitungTotal(j, this.inputJumBeli[i]);
                    break;
                }
            }
        }
    }

    public void getStruk() {
        System.out.println("");
        headline();
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");
        checkInputan();
        System.out.println("==============================================================");
        System.out.println("Total Bayar                                             " + this.jumlahBayar);
        System.out.println("==============================================================");
    }
}