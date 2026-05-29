/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;
import java.util.Scanner;
/**
 *
 * @author INDRA
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner input = new Scanner(System.in);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("SISTEM INFORMASI AKADEMIK");
        System.out.println("==============================");
        
        
        System.out.println("1) Tambah Member");
        System.out.println("2) keluar");
        System.out.print("PILIH MENU [1/2] ; ");
        int menu = input.nextInt();
        
        switch (menu){
            
            case 1:
                System.out.println("========================");
                System.out.println("FORM TAMBAH DATA ANGGOTA");
                System.out.println("==========================");
                System.out.print("PILIH MEMBER [1/2/3] : ");
                int menu2 = input.nextInt();
                
            
                switch(menu2){
            
        
        
            case 1:
                System.out.println("");
                System.out.println("===========================");
                System.out.println("FORM TAMBAH DATA DOSEN");
                System.out.println("===========================");
                System.out.print("NIDN         : ");
                int nidn = input.nextInt();
                input.nextLine();
        
                System.out.print("Nama Lengkap : ");
                String namaDosen = input.nextLine();
        
                System.out.print("Alamat       : ");
                String alamatDosen = input.nextLine();
        
                System.out.print("Email        : ");
                String emailDosen = input.nextLine();
        
                
                DataDosen dosen = new DataDosen(nidn,namaDosen,alamatDosen,emailDosen);
                dosen.tampilDataDosen(dosen);
                break;
        
            case 2:
                System.out.println("");
                System.out.println("===========================");
                System.out.println("FORM TAMBAH DATA KARYAWAN");
                System.out.println("===========================");
                System.out.print("NIP          : ");
                int nip = input.nextInt();
                input.nextLine();
        
                System.out.print("Nama Lengkap : ");
                String namakry = input.nextLine();
        
                System.out.print("Alamat       : ");
                String alamatkry = input.nextLine();
        
                System.out.print("Email        : ");
                String emailkry = input.nextLine();
                
                System.out.print("Divisi       : ");
                String divisi = input.nextLine();
        
                
                DataKaryawan karyawan = new DataKaryawan(nip,namakry,alamatkry,emailkry,divisi);
                karyawan.tampilDataKaryawan(karyawan);
                break;
                
                
            case 3:
                System.out.println("");
                System.out.println("===========================");
                System.out.println("FORM TAMBAH DATA MAHASISWA");
                System.out.println("===========================");
                System.out.print("NIM          : ");
                int nim = input.nextInt();
                input.nextLine();
        
                System.out.print("Nama Lengkap : ");
                String namamhs = input.nextLine();
        
                System.out.print("Alamat       : ");
                String alamatmhs = input.nextLine();
        
                System.out.print("Email        : ");
                String emailmhs = input.nextLine();
                
                System.out.print("Prodi        : ");
                String prodi = input.nextLine();
        
                
                DataMahasiswa mahasiswa = new DataMahasiswa(nim,namamhs,alamatmhs,emailmhs,prodi);
                mahasiswa.tampilDataMahasiswa(mahasiswa);
                break;
        }
            
            case 2:
                break;
        }
        
        
        
        
    }
    
}
