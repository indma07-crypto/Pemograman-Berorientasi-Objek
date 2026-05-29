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
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok balok = new Balok();
        balok.dataBalok(10.0, 5.0, 0);
        balok.tampilBalok();
        balok.tampilvolume();
        
        Tabung tabung = new Tabung();
        tabung.DataTabung(10.0, 8.0, 0);
        tabung.tampilTabung();
        tabung.tampilvolume();
        
        Bola bola = new Bola();
        bola.DataBola(10.0, 0);
        bola.tampilBola();
        bola.tampilvolume();
    }
    
}
