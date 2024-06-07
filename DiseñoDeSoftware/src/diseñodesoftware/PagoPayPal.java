/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diseñodesoftware;

/**
 *
 * @author jorge
 */
public class PagoPayPal extends Pago{
    private boolean loggedIn;
    
    
    public void stayLogged(){
        //iniciar serion
        loggedIn=true;
    }
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn){
            stayLogged();
        }
    }
}
