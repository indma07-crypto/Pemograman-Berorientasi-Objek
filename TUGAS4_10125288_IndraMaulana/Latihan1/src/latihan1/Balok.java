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
public class Balok extends BangunDatar{
    private double panjang;
    private double lebar;

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public void dataBalok(double panjang,double lebar,double volume){
        this.panjang = panjang;
        this.lebar = lebar;
        this.volume = lebar * panjang;
        
    }
    
    public void tampilBalok(){
        System.out.println("TAMPIL VOLUME BALOK");
        System.out.println("Panjang Balok    = " +this.panjang);
        System.out.println("Lebar Balok      = " +this.lebar);
    }
    
    @Override
    public void tampilvolume(){
        System.out.println("VOLUME BALOK     = " +this.volume);
        System.out.println("");
    }
    
    
    }
    

