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
public class Lingkaran {
    //Membuat Properties
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double keliling() {
        return 2 * 3.14 * jariJari;
    }

    double luas() {
        return 3.14 * jariJari * jariJari;
    }
}
    

