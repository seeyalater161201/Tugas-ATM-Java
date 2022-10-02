/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author Aryudha Wily
 */
public interface DaoAtm {
    int getSaldo();
    
    int cekTransaksi(int jumlah);
    
    void tambahSaldo(int jumlah);
    
    void tarikSaldo(int jumlah);
   
}
