/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author INDRA
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Membuat objek dari class Mahasiswa
        mahasiswa mahasiswa1 = new mahasiswa();
        System.out.println("Tampil Data Mahasiswa ke-1");
        mahasiswa1.tambahProfil("Indra Maulana", "10125288", "Teknik Informatika", "2025");
        mahasiswa1.tampilProfil();
        
        //Membauat objek Mahasiswa
        mahasiswa mahasiswa2 = new mahasiswa();
        System.out.println("");
        System.out.println("Tampil Data Mahasiwa ke-2");
        mahasiswa2.tambahProfil("Angga Setiyadi", "10112261", "Teknik Informatika", "2012");
        mahasiswa2.tampilProfil();
    }
    
}
