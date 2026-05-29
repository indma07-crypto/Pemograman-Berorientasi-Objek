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
public class Persegi {
    //Membuat Properties
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double keliling() {
        return 4 * sisi;
    }

    double luas() {
        return sisi * sisi;
    }
}
