/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author INDRA
 */
public class Nasabah {
    private String alamat,noRekening,namaNasabah;
    
    public Nasabah(String alamat, String noRekening, String namaNasabah) {
        this.alamat = alamat;
        this.noRekening = noRekening;
        this.namaNasabah = namaNasabah;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }
}
