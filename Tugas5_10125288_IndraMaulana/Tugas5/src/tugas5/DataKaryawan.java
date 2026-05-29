/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author INDRA
 */
public class DataKaryawan extends Member{
    public DataKaryawan (int id, String nama , String alamat , String email ,String divisi){
        super.id = id;
        super.nama = nama;
        super.alamat = alamat;
        super.email = email;
        this.divisi = divisi;
    }
    
    public void tampilDataKaryawan(DataKaryawan karyawan){
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(super.getNama() +" telah terdaftar sebagai Karyawan " + "passwordnya adalah : " + super.getId() );
        System.out.println("Email telah terkirim ke alamat : " + super.getEmail());
        System.out.println("----------------------------------------------------------------------------------------------");
    }
    
}
