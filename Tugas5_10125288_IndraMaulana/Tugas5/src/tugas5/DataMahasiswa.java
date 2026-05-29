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
public class DataMahasiswa extends Member{
    public DataMahasiswa (int id, String nama , String alamat , String email ,String prodi){
        super.id = id;
        super.nama = nama;
        super.alamat = alamat;
        super.email = email;
        this.prodi = prodi;
    }
    
    public void tampilDataMahasiswa(DataMahasiswa mahasiswa){
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(super.getNama() +" telah terdaftar sebagai Mahasiswa " + "passwordnya adalah : " + super.getId() );
        System.out.println("Email telah terkirim ke alamat : " + super.getEmail());
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}
