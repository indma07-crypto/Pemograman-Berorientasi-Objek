/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author INDRA
 */
public class Persegipanjang {
    //Membuat Properties
    double panjang, lebar;

    Persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double keliling() {
        return 2 * (panjang + lebar);
    }

    double luas() {
        return panjang * lebar;
    }
}
    

