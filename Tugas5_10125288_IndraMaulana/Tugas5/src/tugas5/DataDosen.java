/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

public class DataDosen extends Member{

    public DataDosen (int id, String nama , String alamat , String email ){
        super.id = id;
        super.nama = nama;
        super.alamat = alamat;
        super.email = email;
    }
    
    public void tampilDataDosen(DataDosen dosen){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(super.getNama() +" telah terdaftar sebagai Dosen " + "passwordnya adalah : " + super.getId() );
        System.out.println("Email telah terkirim ke alamat : " + super.getEmail());
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    
        
    }
    

