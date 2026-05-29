/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author INDRA
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Membuat objek dari class bangunDatar
        Persegi p = new Persegi(10);
        Persegipanjang pp = new Persegipanjang (10, 5);
        Lingkaran l = new Lingkaran(7);

        // PERSEGI
        System.out.println("Menghitung Keliling dan Luas Persegi");
        System.out.println("=====================================");
        System.out.printf("Keliling Persegi = %.2f%n", p.keliling());
        System.out.printf("Luas Persegi     = %.2f%n%n", p.luas());

        // PERSEGI PANJANG
        System.out.println("Menghitung Keliling dan Luas Persegi Panjang");
        System.out.println("============================================");
        System.out.printf("Keliling Persegi Panjang = %.2f%n", pp.keliling());
        System.out.printf("Luas Persegi Panjang     = %.2f%n%n", pp.luas());

        // LINGKARAN
        System.out.println("Menghitung Keliling dan Luas Lingkaran");
        System.out.println("======================================");
        System.out.printf("Keliling Lingkaran = %.2f%n", l.keliling());
        System.out.printf("Luas Lingkaran     = %.2f%n", l.luas());
    }
}

