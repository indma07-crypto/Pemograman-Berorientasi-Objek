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
public class Tabung extends BangunDatar{
    private double jari_jari;
    private double tinggi;

    /**
     * @return the jari_jari
     */
    public double getJari_jari() {
        return jari_jari;
    }

    /**
     * @param jari_jari the jari_jari to set
     */
    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public void DataTabung( double jari_jari,double tinggi, double volume){
        this.jari_jari = jari_jari;
        this.tinggi = tinggi;
        this.volume = 3.14 * jari_jari * jari_jari * tinggi;
    }
    
    public void tampilTabung(){
        System.out.println("TAMPIL VOLUME TABUNG");
        System.out.println("Jari Jari Tabung = " +this.jari_jari);
        System.out.println("Tinggi Tabung    = " +this.tinggi);
    }
    
    @Override
    public void tampilvolume(){
        System.out.println("VOLUME TABUNG    = " +this.volume);
        System.out.println("");
    }
    
}
