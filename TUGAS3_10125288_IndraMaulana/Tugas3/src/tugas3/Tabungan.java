/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author INDRA
 */
public class Tabungan {    
    private int saldo;

    public Tabungan() {
        this.saldo =  2_000_000; // 2 juta
    }
    
    public int getSaldo() {
        return saldo;
    } 
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
