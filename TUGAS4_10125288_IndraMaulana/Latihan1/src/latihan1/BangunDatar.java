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
public class BangunDatar {
    protected double volume;

    /**
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public void tampilvolume(){
        System.out.println("Volume " +this.volume);
        System.out.println("");
    }
    
}
