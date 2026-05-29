/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author INDRA
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Daftar Film yang Sedang Tayang diUnikom TV");
        System.out.println("------------------------------------------");
        
        //Membuat objek Film 1
        Unikomtv film1 = new Unikomtv();
        System.out.println("");
        film1.tambahFilm("Spiderman 3", "Action,Adventure,Fantasy", 8.5f, "148 Menit");
        film1.tampilFilm();
        
        //Membuat objek Film 2
        Unikomtv film2 = new Unikomtv();
        System.out.println("");
        film2.tambahFilm("Frozen 2", "Animastion,Adventure,Comedy", 6.5f, "120 Menit");
        film2.tampilFilm();
        
        //Membuat objek Film 3
        Unikomtv film3 = new Unikomtv();
        System.out.println("");
        film3.tambahFilm("Kimi no Na Wa", "animastion,Drama,Supernatural", 8.87f, "107 Menit");
        film3.tampilFilm();
    }
}

