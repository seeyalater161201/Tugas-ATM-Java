/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
/**
 *
 * @author Aryudha Wily
 */
public class ModelAtm implements DaoAtm{
    ImplSaldo saldo;
    
    public ModelAtm(){
        this.saldo = new ImplSaldo();
    }
    
    public int limitSaldo(){
        return this.saldo.batassSaldo;
    }

    @Override
    public int getSaldo() {
        return this.saldo.getSaldoAwal();
    }

    @Override
    public int cekTransaksi(int jumlah) {
         if(jumlah % 50000 == 0){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void tambahSaldo(int jumlah) {
         saldo.setSaldoAwal(saldo.getSaldoAwal()+jumlah);
    }

    @Override
    public void tarikSaldo(int jumlah) {
         saldo.setSaldoAwal(saldo.getSaldoAwal()-jumlah);
    }   
    
}
