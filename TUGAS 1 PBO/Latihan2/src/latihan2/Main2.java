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
        
        int hitung = 0;
        
        System.out.println("Menampilkan bilangan Genap dari 1 s/d 100");
        System.out.println("=========================================");
        
        for (int i = 2; i <= 100 ; i +=2){
            if (i % 2 == 0);{
            System.out.print(i +",");
            hitung++;
            
            if(hitung %5 == 0){
                System.out.println("");
            }
            }
        }
    }
    
}
