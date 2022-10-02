/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAtmMvc;
import SingelTon.View;
import Dao.ModelAtm;
import java.util.Scanner;
/**
 *
 * @author Aryudha Wily
 */
public class TampilanAtm {
    Scanner myObj = new Scanner(System.in);
    private static TampilanAtm view = new TampilanAtm();
    View object = View.getInstance();
    
    public TampilanAtm(){   
    }
    
    public static TampilanAtm getInstance(){   
        return view;
    }
    
    public int mainMenu(){
        object.displayPesan("\nMenu : \n1. Cek Saldo \n2. Tarik Tunai\n3. Setor Tunai\n4. Keluar\n\nMasukkan Pilihan : ");
        return myObj.nextInt();
    }
    
    public void cekSaldo(ModelAtm model){
        object.displayPesan("Sisa saldo : Rp.");
        object.displaySaldo(model.getSaldo());
    }
    
    public void tarikTunai(ModelAtm model){
        int jumlah;
        object.displayPesan("Masukkan jumlah saldo tarik (kelipatan Rp.50.000) : Rp.");
        jumlah = myObj.nextInt();
        
        if((model.getSaldo()> jumlah) && (model.cekTransaksi(jumlah) == 1)){
            model.tarikSaldo(jumlah);
            object.displayPesan("Anda Mengambil Uang Sejumlah : Rp.");
            object.displaySaldo(jumlah);
        } else{
            object.displayPesanBaris("Penarikan harus kelipatan Rp.50.000");
        }
    }
    
    public void setorTunai(ModelAtm model){
        int jumlah;
        object.displayPesan("Masukkan jumlah setoran (kelipatan Rp.50.000): Rp.");
        jumlah = myObj.nextInt();
        if(model.cekTransaksi(jumlah)==1){
            model.tambahSaldo(jumlah);
            object.displayPesan("Berhasil menambahkan saldo sebesar Rp.");
            object.displaySaldo(jumlah);
        } else{
            object.displayPesanBaris("Inputan harus kelipatan Rp.50.000");
        }
        
    }    
}
