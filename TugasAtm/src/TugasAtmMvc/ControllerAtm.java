/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAtmMvc;
import Dao.ModelAtm;
import SingelTon.View;
/**
 *
 * @author Aryudha Wily
 */
public class ControllerAtm {
    public TampilanAtm view;
    public ModelAtm model;
    public View tampil;
    int pilihan;
    
    public ControllerAtm(){
        this.view = new TampilanAtm();
        this.model = new ModelAtm();
        
        while(pilihan!=4){
            pilihan = view.mainMenu();
            switch(pilihan){
                case 1 :
                    view.cekSaldo(model);
                    break;
                case 2:
                    view.tarikTunai(model);
                    break;
                case 3 :
                    view.setorTunai(model);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }    
}
