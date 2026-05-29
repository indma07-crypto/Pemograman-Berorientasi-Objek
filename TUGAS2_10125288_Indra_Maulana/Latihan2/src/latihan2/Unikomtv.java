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
public class Unikomtv {
    //Membuat Properties
    String namaFilm;
    String genreFilm;
    float ratingFilm;
    String durasi;
    
    //Membuat METHOD untuk  Unikomtv
    void tambahFilm(String namaFilm,String genreFilm,float ratingFilm,String durasi){
        this.namaFilm = namaFilm;
        this.genreFilm = genreFilm;
        this.ratingFilm = ratingFilm;
        this.durasi = durasi;
    }
    
    void tampilFilm(){
        System.out.println("Nama Film   : " +namaFilm);
        System.out.println("GEnre Film  : " +genreFilm);
        System.out.println("Rating Film : " +ratingFilm);
        System.out.println("Durasi      : " +durasi);
    }

    
    
}
