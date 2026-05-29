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
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoawal;
        double bunga;
        int saldotarget;
        
        saldoawal = 1000000;
        bunga = 0.10;
        saldotarget = 2000000;
        
        int bulan = 0;
        
        while (saldoawal < saldotarget){
            bulan++;
            saldoawal = saldoawal + (saldoawal * bunga);
            
            System.out.println("Saldo di Bulan ke-" +bulan +" Rp." +(int)saldoawal);
            
        }
    }
    
}
