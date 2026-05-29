/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author INDRA
 */
public class Tabungan {
    double saldoAwal;
    double bunga; // persen
    double target;

    // Constructor
    Tabungan(double saldoAwal, double bunga, double target) {
        this.saldoAwal = saldoAwal;
        this.bunga = bunga;
        this.target = target;
    }

    void simulasi() {
        double saldo = saldoAwal;
        int bulan = 1;

        System.out.println("Tampil Simulasi Tabungan");
        System.out.println("=========================");

        while (saldo < target) {
            saldo = saldo + (saldo * bunga / 100);
            System.out.printf("Saldo di bulan ke-%d : Rp. %.0f%n", bulan, saldo);
            bulan++;
        }
    }
}

