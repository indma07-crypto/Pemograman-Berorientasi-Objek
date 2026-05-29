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
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variabel 
        String namaMahasiswa;
        String kelas;
        int nilaipraktikum;
        int nilaitugas;
        int nilaiuts;
        int nilaiuas;
        double nilaiakhir;
        char indeks;
        char predikatlulus;
        
        //Data Mahasiswa
        namaMahasiswa = ("Selamet Riyadi");
        kelas = ("IF-6");
        nilaipraktikum = 100;
        nilaitugas = 80;
        nilaiuts = 75;
        nilaiuas = 85;
        
        //Operasi Menghitung nilai akhir
        nilaiakhir = (0.1*nilaipraktikum) + (0.2*nilaitugas) + (0.3*nilaiuts) + (nilaiuas) / 3;
        
        //
        System.out.println("Nama Mahasiswa = " +namaMahasiswa);
        System.out.println("Kelas = " +kelas);
        System.out.println("Nilai Praktikum = " +nilaipraktikum);
        System.out.println("Nilai Tugas = " +nilaitugas);
        System.out.println("Nilai UTS = " +nilaiuts);
        System.out.println("Nilai UAS = " +nilaiuas);
        System.out.println("Nilai Akhir = " +nilaiakhir);
        
        //Menampilkan Kasus Kelulusan Mahasiswa
        if(nilaiakhir >= 30){
            System.out.println(namaMahasiswa +" Dinyatakan Lulus Mata Kuliah PBO");
        }
        else{
            System.out.println(namaMahasiswa +" Dinyatakan Tidak Lulus Mata Kuliah PBO");
        }
        if((nilaiakhir >=80) && (nilaiakhir <=100)){
            indeks = 'A';
        }
        else if((nilaiakhir >=65) && (nilaiakhir <=80)){
            indeks ='B';
        }
        else if((nilaiakhir >=45) && (nilaiakhir <=65)){
            indeks ='C';
        }
        else if((nilaiakhir >=30) && (nilaiakhir <=45)){
            indeks ='D';
        }
        else{
            indeks ='E';
        }
        System.out.println("Indeks Nilai Akhir : " +indeks);
        
        
        if (indeks == 'A' ){
            System.out.println("Anda Lulus dengan Sangat Memuaskan");
        }
        else if(indeks == 'B' ){
            System.out.println("Anda Lulus dengan Cukup Memuaskan");
        }
        else if(indeks == 'C' ){
            System.out.println("Anda Lulus dengan Memuaskan");
        }
        else if(indeks == 'D' ){
            System.out.println("Anda Lulus dengan Kurang Memuaskan");
        }
        else {
            System.out.println("");
        }
        
        
    }
    
}
