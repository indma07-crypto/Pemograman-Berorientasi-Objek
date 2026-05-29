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
public class Bola extends BangunDatar{
    private double jari_jari;

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
 
    public void DataBola(double jari_jari,double volume){
        this.jari_jari = jari_jari;
        this.volume = 4.0 / 3.0 * 3.14 * jari_jari * jari_jari * jari_jari;
    }
     public void tampilBola(){
         System.out.println("TAMPIL VOLUME BOLA");
         System.out.println("Jari Jari        = " +this.jari_jari);
     }
     
     @Override
    public void tampilvolume(){
        System.out.println("VOLUME BOLA      = " +this.volume);
         System.out.println("");
    }
}
