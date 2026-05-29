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
public class mahasiswa {
    //Membuat Properties
    String namaMahasiswa;
    String nim;
    String programStudi;
    String angkatan;
    final String universitas = "UNIKOM";
    
    //Membuat METHOD untuk Mahasiswa
    void tambahProfil(String namaMahasiswa,String nim,String programStudi,String angkatan){
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.programStudi = programStudi;
        this.angkatan = angkatan;
    }
    
    void tampilProfil(){
        System.out.println("Nama Mahasiswa : " +this.namaMahasiswa);
        System.out.println("NIM Mahasiswa  : " +this.nim);
        System.out.println("Program Studi  :" +this.programStudi);
        System.out.println("Angkatan       : " +this.angkatan);
        System.out.println("Universitas    : " +this.universitas);
    }
}
